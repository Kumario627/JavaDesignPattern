package visitor;

import java.util.ArrayList;
import java.util.List;

public class FileFindVisitor extends Visitor {
    private final String extend;
    private List<File> files = new ArrayList<>();

    public FileFindVisitor(String extend) {
        this.extend = extend;
    }

    public List<File> getFoundFiles() {
        return files;
    }

    @Override
    public void visit(File file) {
        if(file.getName().contains(extend)) {
            files.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        directory.forEach(dir -> dir.accept(this));
    }
}
