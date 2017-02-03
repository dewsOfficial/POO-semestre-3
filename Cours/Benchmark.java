abstract class Benchmark{
    abstract void benchmark();
    public final long repeat(int c){
        long start =System.nanoTime();
        for(int i=0;i<c;i++) benchmark();
        return (System.nanoTime() -start);
    }
}
class MonBenchmark extends Benchmark{
    void benchmark(){
        
    }
    public static long mesurer(int i){
        return new MonBenchmark().repeat(i);
    }
    public static void main(String[] st){
        System.out.println("temps="+ MonBenchmark.mesurer(1000000));
    }
}
