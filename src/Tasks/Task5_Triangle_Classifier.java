package Tasks;

public class Task5_Triangle_Classifier {

    //Write a program that classifies a triangle based on its side lengths.
    // Given three input values representing the lengths of the sides,
    // determine if the triangle is equilateral (all sides are equal),
    // isosceles (exactly two sides are equal),
    // or scalene (no sides are equal). Use an if-else statement to classify the triangle
    public static void main(String[] args) {
        int s1=4;
        int s2=2;
        int s3 =3;

        if (s1+s2 > s3 && s2+s3 >s1 && s1 +s3 >s2 ) {
//all side are equal
            if (s1 == s2 && s2 == s3) {

                System.out.println("equilateral");
            }
            //2 side are equal
            else if (s1 == s2 || s2 == s3 || s1 == s3) {
                System.out.println("isosceles");

            } else {
                System.out.println("scalene");
            }
        }else{

                System.out.println("invalid triangle");
            }
        }




        }







