public class Student {
    private String name;
    private int age;

    public Student(String name, Integer age)throws SvoiException {
        this.name = name;
        this.age = age;
        try {
            if (age <= -1) {
                throw new SvoiException("Jashy tuura emes");
            }
        } catch (SvoiException e) {
            System.out.println(e + " Studentin jashyn ondonuz");
            try {
                if (name != null) {
                    throw new SvoiException("Aty tuura emes");
                }
            } catch (SvoiException en) {
                System.out.println(en + " Atyn jaz");
            } finally {
                System.out.println("Buttu");
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)  {

        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
