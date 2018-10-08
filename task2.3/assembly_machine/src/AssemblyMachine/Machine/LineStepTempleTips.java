package AssemblyMachine.Machine;

import AssemblyMachine.Parts.IProductPart;
import AssemblyMachine.Parts.TempleTips;

public class LineStepTempleTips implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Creating the temple tipps of a product");
        return new TempleTips();
    }
}
