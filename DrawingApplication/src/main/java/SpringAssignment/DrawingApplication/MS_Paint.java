package SpringAssignment.DrawingApplication;

public class MS_Paint {
	
	
	private String pageHeight;
	private String pageWidth;
	private String penColor;
	private String penSize;
	
	public MS_Paint(String pageHeight, String pageWidth, String penColor, String penSize) {
		super();
		this.pageHeight = pageHeight;
		this.pageWidth = pageWidth;
		this.penColor = penColor;
		this.penSize = penSize;
	}
	public MS_Paint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPageHeight() {
		return pageHeight;
	}
	public void setPageHeight(String pageHeight) {
		this.pageHeight = pageHeight;
	}
	public String getPageWidth() {
		return pageWidth;
	}
	public void setPageWidth(String pageWidth) {
		this.pageWidth = pageWidth;
	}
	public String getPenColor() {
		return penColor;
	}
	public void setPenColor(String penColor) {
		this.penColor = penColor;
	}
	public String getPenSize() {
		return penSize;
	}
	public void setPenSize(String penSize) {
		this.penSize = penSize;
	}
	
	@Override
	public String toString() {
		return "MS_Paint [pageHeight=" + pageHeight + ", pageWidth=" + pageWidth + ", penColor=" + penColor
				+ ", penSize=" + penSize + "]";
	}
	
	
	 

}
