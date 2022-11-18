
public class Motorbike {

           private int year;
       private String model;
       private String color;

        public String getModel() {

            return model;
        }

        public int getYear() {
            return year;
        }

        public String getColor() {
            this.color=color;
            return color;
        }

        public Motorbike(int year,String model, String color) {
            this.model = model;
            this.year = year;
            this.color = color;
        }


        public static void main(String[] args) {

            Motorbike motorbike = new Motorbike(2020, "Honda", "Black");
            System.out.println(motorbike.getModel() + "\n" +
                    motorbike.getYear() + "\n" +
                    motorbike.getColor());
        }
    }








