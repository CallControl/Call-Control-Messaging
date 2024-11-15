package dev.octoshrimpy.quik.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldev/octoshrimpy/quik/manager/KeyManagerImpl;", "Ldev/octoshrimpy/quik/manager/KeyManager;", "()V", "initialized", "", "maxValue", "", "newId", "reset", "", "data_noAnalyticsRelease"})
@javax.inject.Singleton
public final class KeyManagerImpl implements dev.octoshrimpy.quik.manager.KeyManager {
    private boolean initialized = false;
    private long maxValue = 0L;
    
    @javax.inject.Inject
    public KeyManagerImpl() {
        super();
    }
    
    /**
     * Should be called when a new sync is being started
     */
    @java.lang.Override
    public void reset() {
    }
    
    /**
     * Returns a valid ID that can be used to store a new message
     */
    @java.lang.Override
    public long newId() {
        return 0L;
    }
}