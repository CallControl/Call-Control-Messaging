package dev.octoshrimpy.quik.feature.gallery;

import android.content.Context;
import dagger.internal.Factory;
import dev.octoshrimpy.quik.common.Navigator;
import dev.octoshrimpy.quik.interactor.SaveImage;
import dev.octoshrimpy.quik.manager.PermissionManager;
import dev.octoshrimpy.quik.repository.ConversationRepository;
import dev.octoshrimpy.quik.repository.MessageRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GalleryViewModel_Factory implements Factory<GalleryViewModel> {
  private final Provider<ConversationRepository> conversationRepoProvider;

  private final Provider<Long> partIdProvider;

  private final Provider<Context> contextProvider;

  private final Provider<MessageRepository> messageRepoProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<SaveImage> saveImageProvider;

  private final Provider<PermissionManager> permissionsProvider;

  public GalleryViewModel_Factory(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Long> partIdProvider,
      Provider<Context> contextProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<SaveImage> saveImageProvider,
      Provider<PermissionManager> permissionsProvider) {
    this.conversationRepoProvider = conversationRepoProvider;
    this.partIdProvider = partIdProvider;
    this.contextProvider = contextProvider;
    this.messageRepoProvider = messageRepoProvider;
    this.navigatorProvider = navigatorProvider;
    this.saveImageProvider = saveImageProvider;
    this.permissionsProvider = permissionsProvider;
  }

  @Override
  public GalleryViewModel get() {
    return provideInstance(
        conversationRepoProvider,
        partIdProvider,
        contextProvider,
        messageRepoProvider,
        navigatorProvider,
        saveImageProvider,
        permissionsProvider);
  }

  public static GalleryViewModel provideInstance(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Long> partIdProvider,
      Provider<Context> contextProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<SaveImage> saveImageProvider,
      Provider<PermissionManager> permissionsProvider) {
    return new GalleryViewModel(
        conversationRepoProvider.get(),
        partIdProvider.get(),
        contextProvider.get(),
        messageRepoProvider.get(),
        navigatorProvider.get(),
        saveImageProvider.get(),
        permissionsProvider.get());
  }

  public static GalleryViewModel_Factory create(
      Provider<ConversationRepository> conversationRepoProvider,
      Provider<Long> partIdProvider,
      Provider<Context> contextProvider,
      Provider<MessageRepository> messageRepoProvider,
      Provider<Navigator> navigatorProvider,
      Provider<SaveImage> saveImageProvider,
      Provider<PermissionManager> permissionsProvider) {
    return new GalleryViewModel_Factory(
        conversationRepoProvider,
        partIdProvider,
        contextProvider,
        messageRepoProvider,
        navigatorProvider,
        saveImageProvider,
        permissionsProvider);
  }

  public static GalleryViewModel newGalleryViewModel(
      ConversationRepository conversationRepo,
      long partId,
      Context context,
      MessageRepository messageRepo,
      Navigator navigator,
      SaveImage saveImage,
      PermissionManager permissions) {
    return new GalleryViewModel(
        conversationRepo, partId, context, messageRepo, navigator, saveImage, permissions);
  }
}
