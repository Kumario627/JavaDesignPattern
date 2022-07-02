package builder;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1) {
            usage();
            System.exit(0);
        }

        switch (args[0]) {
            case "text": {
                TextBuilder textBuilder = new TextBuilder();
                Director director = new Director(textBuilder);
                director.construct();
                String result = textBuilder.getTextResult();
                System.out.println(result);
                break;
            }
            case "html": {
                HtmlBuilder htmlBuilder = new HtmlBuilder();
                Director director = new Director(htmlBuilder);
                director.construct();
                String result = htmlBuilder.getHtmlResult();
                System.out.println(result);
                break;
            }
            default:
                usage();
                System.exit(0);
                break;
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main text       テキストで文書作成");
        System.out.println("Usage: java Main html       HTMLファイルで文書作成");
    }
}
