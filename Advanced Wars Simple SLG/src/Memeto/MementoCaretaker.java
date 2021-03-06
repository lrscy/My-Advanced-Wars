package Memeto;

/**
 * Description: 备忘录管理者
 */
public class MementoCaretaker {
    private static MementoCaretaker mementoCaretaker;
    private Memento memento = null;

    public static MementoCaretaker getInstance() {
        if( mementoCaretaker == null ) {
            synchronized( MementoCaretaker.class ) {
                if( mementoCaretaker == null ) {
                    mementoCaretaker = new MementoCaretaker();
                }
            }
        }
        return mementoCaretaker;
    }

    public Memento restore() { return memento; }

    public void save( Memento memento ) { this.memento = memento; }
}
