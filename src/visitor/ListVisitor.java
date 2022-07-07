package visitor;

public class ListVisitor extends Visitor {
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir += "/" + directory.getName();
        directory.forEach(dir -> dir.accept(this));
        currentDir = saveDir;
    }
}
