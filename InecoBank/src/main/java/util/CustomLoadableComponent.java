package util;

public abstract class CustomLoadableComponent<T extends CustomLoadableComponent<T>> {
    public CustomLoadableComponent() {
    }
    public T get() {
        try {
            this.isLoaded();     // true         // need to be a false, at first
            return (T) this;
        } catch (Error var2) {
            this.load();
            this.isLoaded();
            return (T) this;
        }
//        if(this.isLoaded()) {
//            return (T) this;
//        }else {
//            this.load();
//            this.isLoaded();
//            return (T) this;
//        }
    }

    protected abstract void load();
    protected abstract void isLoaded() throws Error;
}
