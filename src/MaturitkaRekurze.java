public class MaturitkaRekurze {
    public static float legendr(int n_value, int x_value) {
        float legender_value;
        if (n_value == 0){
            return 1;
        }
        if (n_value == 1){
            return x_value;
        }
        else{
            legender_value = ((2*(n_value-1)+1)*x_value*legendr(n_value-1,x_value)-(n_value-1)*(legendr(n_value-2, x_value)))/n_value;

        }
        return legender_value;
    }



}
