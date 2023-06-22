class Solution {
    public double[] convertTemperature(double celsius) {

        double[] results = new double[2];

        results[0] = celsius + 273.15;

        results[1] = celsius * 1.80 + 32.00;

        return results;
        
    }
}