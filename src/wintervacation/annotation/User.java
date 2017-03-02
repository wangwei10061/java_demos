package wintervacation.annotation;

/**
 * Created by wangw on 2016/1/28.
 */
@Table("user")
public class User {
    @Column("name")
    private String name;
    @Column("age")
    private int age;
    @Column("stuId")
    private String stuId;
    @Column("phone")
    private String phone;
    @Column("sex")
    private int sex;    //0代表男，1代表女

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
