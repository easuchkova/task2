public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    final int NUMBER = 33;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == NUMBER) {
                errorCallback.onError("ERROR! Task " + i + " is not done");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
