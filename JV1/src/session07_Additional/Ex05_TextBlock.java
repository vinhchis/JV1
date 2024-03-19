package session07_Additional;

public class Ex05_TextBlock {
    String code = """
            <!DOCTYPE html>
            <html>
            <head>
            <title>Page Title</title>
            </head>
            <body>

            <h1>This is a Heading</h1>
            <p>This is a paragraph.</p>

            </body>
            </html>
                """;
    public Ex05_TextBlock() {
        System.out.println(code);
    }
    public static void main(String[] args) {
        new Ex05_TextBlock();
    }
}
