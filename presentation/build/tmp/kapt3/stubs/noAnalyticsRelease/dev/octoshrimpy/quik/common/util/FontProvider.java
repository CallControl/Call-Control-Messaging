package dev.octoshrimpy.quik.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Ldev/octoshrimpy/quik/common/util/FontProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "lato", "Landroid/graphics/Typeface;", "pendingCallbacks", "Ljava/util/ArrayList;", "Lkotlin/Function1;", "", "getLato", "callback", "presentation_noAnalyticsRelease"})
@javax.inject.Singleton
public final class FontProvider {
    private android.graphics.Typeface lato;
    private final java.util.ArrayList<kotlin.jvm.functions.Function1<android.graphics.Typeface, kotlin.Unit>> pendingCallbacks = null;
    
    @javax.inject.Inject
    public FontProvider(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final void getLato(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.graphics.Typeface, kotlin.Unit> callback) {
    }
}