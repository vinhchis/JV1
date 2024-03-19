package session07_Additional;

class Education {
    public Education() {
        System.out.println("Education System");
    }
}

class University extends Education {
    String decs = """
            <h1>University</h1>
            <p>Certificate: Bachelor</p>
            <p>Duration: 4-5 years</p>
            """;

    public University() {

    }

    public void study() {
        System.out.println(decs);
    }
}

class College extends Education {
    String decs = """
            <h1>College</h1>
            <p>Certificate: Bachelor</p>
            <p>Duration: 2-3 years</p>
            """;

    public College() {

    }

    public void study() {
        System.err.println(decs);
    }
}

public class Ex06_Instanceof {
    static void getInstanceof() {
        Education university, college;

        university = new University();

        if (university instanceof University) {
            University uni = (University) university;
            uni.study();
        }

        college = new College();
        if (college instanceof College) {
            College col = (College) college;
            col.study();
        }

    }

    public static void main(String[] args) {
        Ex06_Instanceof.getInstanceof();
    }
}
