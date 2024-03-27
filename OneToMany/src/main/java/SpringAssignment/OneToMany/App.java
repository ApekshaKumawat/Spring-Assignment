package SpringAssignment.OneToMany;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("SpringAssignment.OneToMany");
    	
    	TrainerRepo trainerRepo = context.getBean(TrainerRepo.class);
    	
    	List<Trainer> trainerList = trainerRepo.getAll();
    	
    	 for (Trainer trainer : trainerList) {
    		 System.out.println("Trainer Id: " + trainer.getTrainerId());
             System.out.println("Trainer Name: " + trainer.getTrainerName());
             System.out.println("Sessions Details:");
             for (Session session : trainer.getSession()) {
                 System.out.println("- " +session.getSessionId()+ " : " + session.getSessionName());
             }
             System.out.println();
    }
}
