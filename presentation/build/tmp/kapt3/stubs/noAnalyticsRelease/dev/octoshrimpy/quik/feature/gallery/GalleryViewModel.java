package dev.octoshrimpy.quik.feature.gallery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Ldev/octoshrimpy/quik/feature/gallery/GalleryViewModel;", "Ldev/octoshrimpy/quik/common/base/QkViewModel;", "Ldev/octoshrimpy/quik/feature/gallery/GalleryView;", "Ldev/octoshrimpy/quik/feature/gallery/GalleryState;", "conversationRepo", "Ldev/octoshrimpy/quik/repository/ConversationRepository;", "partId", "", "context", "Landroid/content/Context;", "messageRepo", "Ldev/octoshrimpy/quik/repository/MessageRepository;", "navigator", "Ldev/octoshrimpy/quik/common/Navigator;", "saveImage", "Ldev/octoshrimpy/quik/interactor/SaveImage;", "permissions", "Ldev/octoshrimpy/quik/manager/PermissionManager;", "(Ldev/octoshrimpy/quik/repository/ConversationRepository;JLandroid/content/Context;Ldev/octoshrimpy/quik/repository/MessageRepository;Ldev/octoshrimpy/quik/common/Navigator;Ldev/octoshrimpy/quik/interactor/SaveImage;Ldev/octoshrimpy/quik/manager/PermissionManager;)V", "bindView", "", "view", "presentation_noAnalyticsRelease"})
public final class GalleryViewModel extends dev.octoshrimpy.quik.common.base.QkViewModel<dev.octoshrimpy.quik.feature.gallery.GalleryView, dev.octoshrimpy.quik.feature.gallery.GalleryState> {
    private final long partId = 0L;
    private final android.content.Context context = null;
    private final dev.octoshrimpy.quik.repository.MessageRepository messageRepo = null;
    private final dev.octoshrimpy.quik.common.Navigator navigator = null;
    private final dev.octoshrimpy.quik.interactor.SaveImage saveImage = null;
    private final dev.octoshrimpy.quik.manager.PermissionManager permissions = null;
    
    @javax.inject.Inject
    public GalleryViewModel(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.ConversationRepository conversationRepo, @javax.inject.Named(value = "partId")
    long partId, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.repository.MessageRepository messageRepo, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.common.Navigator navigator, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.interactor.SaveImage saveImage, @org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.manager.PermissionManager permissions) {
        super(null);
    }
    
    @java.lang.Override
    public void bindView(@org.jetbrains.annotations.NotNull
    dev.octoshrimpy.quik.feature.gallery.GalleryView view) {
    }
}