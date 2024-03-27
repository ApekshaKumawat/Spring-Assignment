package SpringAssignment.OneToMany.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer {
	
	@Id	
	private int trainerId;
	private String trainerName;
	private List<Session> session;
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public List<Session> getSession() {
		return session;
	}
	public void setSession(List<Session> session) {
		this.session = session;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", session=" + session + "]";
	}
	public Trainer(int trainerId, String trainerName, List<Session> session) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
