package AssemblyMachine.Machine;

import AssemblyMachine.Parts.IProductPart;
import AssemblyMachine.Parts.Lenses;

public class LineStepLenses implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Creating the lenses of a product");
        return new Lenses();
    }
}
