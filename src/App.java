/* 5教科の平均点を計算するcalculateAvgメソッド */
class Student{
    String name;
  
    public double calculateAvg(double[] data) {
      double sum = 0;
      for( int i=0; i < data.length; i++ ) {
              sum += data[i];
            }
      double avg = sum/data.length;
      return avg;
    }
  
/*5教科の平均点を計算するcalculateAvgメソッド */
    public String jedge(double avg) {
      String result;
      if( avg >= 60 ) {
        result = "passed";
      } else {
        result = "failed";
      }
      return result;
    }
  }
  
  public class App{
    public static void main(String[] args){
      Student a001 = new Student();
      a001.name = "higashi";
      double[] data = { 80, 70, 50, 90, 60};
  
      double avg = a001.calculateAvg(data);
      String result = a001.jedge(avg);    
  
      System.out.println(avg);
      System.out.println(a001.name + " " + result);
  
    }
  }