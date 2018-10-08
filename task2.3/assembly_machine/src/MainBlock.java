import AssemblyMachine.Machine.AssemblyLine;
import AssemblyMachine.Machine.LineStepCorpus;
import AssemblyMachine.Machine.LineStepLenses;
import AssemblyMachine.Machine.LineStepTempleTips;
import AssemblyMachine.Product.IProduct;
import AssemblyMachine.Product.Product;

public class MainBlock {
    public static void main(String[] args) {

        AssemblyLine assemblyLine = new AssemblyLine(new LineStepCorpus(), new LineStepLenses(), new LineStepTempleTips());
        IProduct glasses = new Product();
        glasses = assemblyLine.assembleProduct(glasses);
    }
}
