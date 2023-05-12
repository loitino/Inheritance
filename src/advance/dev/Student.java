package advance.dev;

public class Student extends Person {
	float diemToan;
	float diemLy;
	float diemHoa;
	String maSinhViem;
	String lop;

	public Student(String name, int age, String phoneNumber, float diemToan, float diemLy, float diemHoa,
			String maSinhViem, String lop) {
		super(name, age, phoneNumber);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.maSinhViem = maSinhViem;
		this.lop = lop;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public String getMaSinhViem() {
		return maSinhViem;
	}

	public void setMaSinhViem(String maSinhViem) {
		this.maSinhViem = maSinhViem;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public float diemTrungBinh() {
		return (this.diemHoa + this.diemLy + this.diemToan) / 3;
	}

	@Override
	public String toString() {
		return "Student [diemToan=" + diemToan + ", diemLy=" + diemLy + ", diemHoa=" + diemHoa + ", maSinhViem="
				+ maSinhViem + ", lop=" + lop + "]";
	}
	
	
}
