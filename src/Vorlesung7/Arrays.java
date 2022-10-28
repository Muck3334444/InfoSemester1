package Vorlesung7;

public class Arrays {
    public static void main(String[] args) {
        for (String element:args) {
            System.out.println(element);
        }
        int[] array = new int[]{2,34,5,1,7,8,3,4,7,12};
        //System.out.println(calculateAverage(array));
        int[] a = fillPascalsTriangle();
    }

    private static double calculateAverage(int[] numbers){
        double totalValue = 0;
        for (int value:
             numbers) {
            totalValue += value;
        }
        return  totalValue / numbers.length;
    }

    private static int[] fillPascalsTriangle(){
        int maxLayers = 7;
        int arraySize = (int)((maxLayers + 1) * Math.floor(maxLayers / 2) + Math.ceil(maxLayers / 2.0) * (maxLayers % 2));
        int[] triangleValues = new int[arraySize];
        int currentLayerSize = 1;
        int distanceLastLayerIndex = 0;
        for (int i = 0; i < triangleValues.length; i++) {
            if (distanceLastLayerIndex == currentLayerSize){
                currentLayerSize++;
                distanceLastLayerIndex = 0;
                System.out.println("");
            }
            distanceLastLayerIndex++;
            triangleValues[i] = binomialCoefficient(currentLayerSize - 1,distanceLastLayerIndex - 1);
            System.out.print(triangleValues[i] + " ");
        }
        return triangleValues;
    }

    private static int binomialCoefficient(int n, int k){
        return (faculty(n) / (faculty(n-k) * faculty(k)));
    }
    private static int faculty(int n){
        int facultyN = 1;
        for (int i = n; i > 0; i--) {
            facultyN *= i;
        }
        return facultyN;
    }
}
