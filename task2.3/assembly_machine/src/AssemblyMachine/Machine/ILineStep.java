package AssemblyMachine.Machine;

import AssemblyMachine.Parts.IProductPart;

public interface ILineStep {
    public IProductPart buildProductPart();
}
