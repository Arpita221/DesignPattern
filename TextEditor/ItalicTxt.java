package TextEditor;
class ItalicText extends TextDecorator {
    public ItalicText(TextCompnt textCompnt) {
        super(textCompnt);
    }

    @Override
    public String getDes() {
        return super getDes() + ", italic";
    }
}
