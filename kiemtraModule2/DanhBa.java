package kiemtraModule2;

public class DanhBa {
    private String sđt ;
    private String nhom;
    private String name;
    private String gender;
    private String address;
    private String ngaysinh;
    private String email;
    public DanhBa(){

    }

    public DanhBa(String sđt, String nhom, String name, String gender, String address, String ngaysinh, String email) {
        this.sđt = sđt;
        this.nhom = nhom;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.ngaysinh = ngaysinh;
        this.email = email;
    }

    public String getSđt() {
        return sđt;
    }

    public void setSđt(String sđt) {
        this.sđt = sđt;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DanhBa" +
                ","+ "sđt= " + sđt +
                ","+ "nhom= " + nhom  +
                ","+"name= " + name  +
                ","+"gender= " + gender  +
                ","+"address= " + address +
                ","+"ngaysinh= " + ngaysinh +
                ","+"email= " + email;
    }
}
