public class Ext1 {

    OutputText outputText;
    WithdrawResources withdrawResources;

    public Ext1(OutputText outputText, WithdrawResources withdrawResources) {
        this.outputText = outputText;
        this.withdrawResources = withdrawResources;
    }

    public void init() {
        outputText.setMessage(outputText.getMessage().toUpperCase());
        System.out.println("\nExt1 module files:");
        withdrawResources.printResources("/Users/Eugene/IdeaProjects/SpringTask/ext1/src/main/resources/ext1");
    }

}
