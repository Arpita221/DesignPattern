package TextEditor;

public abstract class TextDecorator {
    protected TextCompnt textCompnt;
    public TextDecorator(TextCompnt)
    {
        this.textCompnt=textCompnt();
    }
public String getText(){
    return textCompnt.getText();

}



public String getDes(){
    return textCompnt.getDes();

}





















    
}
