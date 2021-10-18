public class Ext2 {

    OutputText outputText;
    WithdrawResources withdrawResources;

    public Ext2(OutputText outputText, WithdrawResources withdrawResources) {
        this.outputText = outputText;
        this.withdrawResources = withdrawResources;
    }

    public void init() {
        outputText.setMessage(outputText.getMessage().repeat(2));
        System.out.println("\nExt2 module files:");
        withdrawResources.printResources("/Users/Eugene/IdeaProjects/SpringTask/ext2/src/main/resources/ext2");
    }

}
