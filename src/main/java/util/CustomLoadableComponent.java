package util;

public abstract class CustomLoadableComponent<T extends CustomLoadableComponent<T>> {
    public CustomLoadableComponent() {
    }
    public T get() {
        try {
            this.isLoaded();
            return (T) this;
        } catch (Error var2) {
            this.load();
            this.isLoaded();
            return (T) this;
        }
    }
    protected abstract void load();
    protected abstract void isLoaded() throws Error;
}
