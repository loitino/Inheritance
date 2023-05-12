package advance.dev;

public class Teacher extends Person {
	private String maGV;
	private double heSL;

	public Teacher(String ten, int tuoi, String soDT) {
		super(ten, tuoi, soDT);
	}

	public Teacher(String ten, int tuoi, String soDT, String maGV, double heSL) {
		super(ten, tuoi, soDT);
		this.maGV = maGV;
		this.heSL = heSL;
	}

	public String getMaGV() {
		return maGV;
	}

	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}

	public double getHeSL() {
		return heSL;
	}

	public void setHeSL(double heSL) {
		this.heSL = heSL;
	}

	public double hamTinhLuong() {
		return heSL * 1500000;

	}

	@Override
	public String toString() {
		return "Teacher [maGV=" + maGV + ", heSL=" + heSL + "]";
	}
	
	
}
