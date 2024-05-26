package TextEditor;

class UnderlinedText extends TextDecorator {
    public UnderlinedText(TextCompnt textCompnt) {
        super(textCompnt);
    }

    @Override
    public String getDes() {
        return super getDes() + ", italic";
    }
}
