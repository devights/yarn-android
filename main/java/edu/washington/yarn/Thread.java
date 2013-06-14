package edu.washington.yarn;

public class Thread {

	private String threadTitle;
	private String threadSubject;
	private int id;

	public String getThreadTitle() {
		return threadTitle;
	}

	public void setThreadTitle(String title) {
		this.threadTitle = title;
	}

	public String getThreadSubject() {
		return threadSubject;
	}

	public void setThreadSubject(String subject) {
		this.threadSubject = subject;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "[ id=" + id+ "title=" + threadTitle + ", subject=" +
                threadSubject +  "]";
	}
}
