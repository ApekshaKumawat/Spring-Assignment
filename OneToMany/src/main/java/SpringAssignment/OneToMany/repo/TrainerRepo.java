package SpringAssignment.OneToMany.repo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import SpringAssignment.OneToMany.model.Session;
import SpringAssignment.OneToMany.model.Trainer;

@Repository
public class TrainerRepo {
	
	private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/oneToMany", "root", "1234");
    }

    public List<Trainer> getAll() {
        List<Trainer> trainerList = new ArrayList<>();
        Map<Integer, Trainer> trainerMap = new HashMap<>();

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {

            String query = "SELECT t.trainer_id, t.name AS trainer_name, " +
                    "s.session_id, s.name AS session_name " +
                    "FROM trainer t LEFT JOIN session s ON t.trainer_id = s.trainer_id";

            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                int trainerId = resultSet.getInt("trainer_id");
                String trainerName = resultSet.getString("trainer_name");
                int sessionId = resultSet.getInt("session_id");
                String sessionName = resultSet.getString("session_name");

                Trainer trainer;
                
                if (!trainerMap.containsKey(trainerId)) {
                    trainer = new Trainer(trainerId, trainerName,new ArrayList<>());
                    trainerList.add(trainer);
                    trainerMap.put(trainerId, trainer);
                } else {
                    trainer = trainerMap.get(trainerId);
                }

                if (sessionId != 0) {
                    Session session = new Session(sessionId, sessionName);
                    trainer.getSession().add(session);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return trainerList;
    }
}
