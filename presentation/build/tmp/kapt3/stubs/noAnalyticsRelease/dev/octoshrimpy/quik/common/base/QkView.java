package dev.octoshrimpy.quik.common.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Ldev/octoshrimpy/quik/common/base/QkView;", "State", "Landroidx/lifecycle/LifecycleOwner;", "render", "", "state", "(Ljava/lang/Object;)V", "presentation_noAnalyticsRelease"})
public abstract interface QkView<State extends java.lang.Object> extends androidx.lifecycle.LifecycleOwner {
    
    public abstract void render(State state);
}