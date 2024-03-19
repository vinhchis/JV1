package session07_Additional;


class Entity{
    private String code, name;

    public Entity(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


record Student(String code, String name) {
}

public class Ex07_Record {
    public static void main(String[] args) {
        String code = "Student001";
        String name = "Le Van A";

        var entity = new Entity(code, name);

        var student = new Student(code, name);

        System.out.printf("Entity: code =  %20s -  name = %20s\n", entity.getCode(), entity.getName());
        System.out.printf("Student: name = %20s - name = %20s\n", student.code(), student.name());
    }    
}
