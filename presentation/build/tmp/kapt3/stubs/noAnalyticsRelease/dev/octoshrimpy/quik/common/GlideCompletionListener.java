package dev.octoshrimpy.quik.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J4\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016JA\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\bH\u0016\u00a2\u0006\u0002\u0010\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ldev/octoshrimpy/quik/common/GlideCompletionListener;", "T", "Lcom/bumptech/glide/request/RequestListener;", "listener", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z", "presentation_noAnalyticsRelease"})
public final class GlideCompletionListener<T extends java.lang.Object> implements com.bumptech.glide.request.RequestListener<T> {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> listener = null;
    
    public GlideCompletionListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
        super();
    }
    
    @java.lang.Override
    public boolean onLoadFailed(@org.jetbrains.annotations.Nullable
    com.bumptech.glide.load.engine.GlideException e, @org.jetbrains.annotations.Nullable
    java.lang.Object model, @org.jetbrains.annotations.Nullable
    com.bumptech.glide.request.target.Target<T> target, boolean isFirstResource) {
        return false;
    }
    
    @java.lang.Override
    public boolean onResourceReady(T resource, @org.jetbrains.annotations.Nullable
    java.lang.Object model, @org.jetbrains.annotations.Nullable
    com.bumptech.glide.request.target.Target<T> target, @org.jetbrains.annotations.Nullable
    com.bumptech.glide.load.DataSource dataSource, boolean isFirstResource) {
        return false;
    }
}