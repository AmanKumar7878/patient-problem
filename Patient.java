public class Patient {
    String patientName;
    double weight,height;

     Patient()
    {
         patientName = "Aman";
         height = 1.8;
         weight = 60;
    }
    public void computeBMI()
    {
        double BMI = weight/(height*height);
        System.out.println(BMI);


    }

    public static void main(String[] args) {
        Patient obj = new Patient();
        obj.computeBMI();
    }

}
