package com.pobeda.stockWatcher.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("StockWatcherService")
public interface StockWatcherService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use StockWatcherService.App.getInstance() to access static instance of StockWatcherServiceAsync
     */
    public static class App {
        private static StockWatcherServiceAsync ourInstance = GWT.create(StockWatcherService.class);

        public static synchronized StockWatcherServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
