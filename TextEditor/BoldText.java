package TextEditor;

public class BoldText extends TextDecorator {
    public BoldText(TextCompnt textCompnt) {
        super(textCompnt);
    }

    @Override
    public String getText() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getText'");
    }

    @Override
    public String getDeS() {
        return super getDeS() + ", bold";
    }
    
}

  