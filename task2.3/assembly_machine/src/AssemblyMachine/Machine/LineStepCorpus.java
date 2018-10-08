package AssemblyMachine.Machine;

import AssemblyMachine.Parts.Corpus;
import AssemblyMachine.Parts.IProductPart;

public class LineStepCorpus implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        System.out.println("Creating a corpus of a product");
        return new Corpus();
    }
}
