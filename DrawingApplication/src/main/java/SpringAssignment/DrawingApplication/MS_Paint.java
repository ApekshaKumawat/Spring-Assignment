package SpringAssignment.DrawingApplication;

public class MS_Paint {
	
	
	private int pageHeight;
	private int pageWidth;
	private String penColor;
	private int penSize;
	
	public MS_Paint(int pageHeight, int pageWidth, String penColor, int penSize) {
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
	public int getPageHeight() {
		return pageHeight;
	}
	public void setPageHeight(int pageHeight) {
		this.pageHeight = pageHeight;
	}
	public int getPageWidth() {
		return pageWidth;
	}
	public void setPageWidth(int pageWidth) {
		this.pageWidth = pageWidth;
	}
	public String getPenColor() {
		return penColor;
	}
	public void setPenColor(String penColor) {
		this.penColor = penColor;
	}
	public int getPenSize() {
		return penSize;
	}
	public void setPenSize(int penSize) {
		this.penSize = penSize;
	}
	
	@Override
	public String toString() {
		return "MS_Paint [pageHeight=" + pageHeight + ", pageWidth=" + pageWidth + ", penColor=" + penColor
				+ ", penSize=" + penSize + "]";
	}
	
	
	 

}