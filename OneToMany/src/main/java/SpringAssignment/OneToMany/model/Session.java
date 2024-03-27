package SpringAssignment.OneToMany.model;

public class Session {
	
	private int sessionId;
	private String sessionName;

	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionName() {
		return sessionName;
	}
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	@Override
	public String toString() {
		return "Session [sessionId=" + sessionId + ", sessionName=" + sessionName  + "]";
	}
	public Session(int sessionId, String sessionName) {
		super();
		this.sessionId = sessionId;
		this.sessionName = sessionName;
	}
	public Session() {
		super();
	}
	
	
		
}
