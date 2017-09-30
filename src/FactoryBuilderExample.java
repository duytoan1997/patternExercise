public class FactoryBuilderExample {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        FactoryBuilderExample factoryBuilderExample=new FactoryBuilderExample();
        Teacher teacher=new Teacher();
        Student student =new Student();
        if(teacher.getId().equals(factoryBuilderExample.getId())){
         teacher.setName("dong an");
         teacher.setAge(22);
         teacher.setSubjects("java");
        }
        else if(student.getId().equals(factoryBuilderExample.getId())){
            student.setName("duy toan");
            student.setAge(20);
        }
    }
}
