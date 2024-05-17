package com.lasuak.kvplayer.ui.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.lasuak.kvplayer.model.Video;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class PlayerFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private PlayerFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private PlayerFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static PlayerFragmentArgs fromBundle(@NonNull Bundle bundle) {
    PlayerFragmentArgs __result = new PlayerFragmentArgs();
    bundle.setClassLoader(PlayerFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("folderId")) {
      long folderId;
      folderId = bundle.getLong("folderId");
      __result.arguments.put("folderId", folderId);
    } else {
      throw new IllegalArgumentException("Required argument \"folderId\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("position")) {
      int position;
      position = bundle.getInt("position");
      __result.arguments.put("position", position);
    } else {
      throw new IllegalArgumentException("Required argument \"position\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("video")) {
      Video video;
      if (Parcelable.class.isAssignableFrom(Video.class) || Serializable.class.isAssignableFrom(Video.class)) {
        video = (Video) bundle.get("video");
      } else {
        throw new UnsupportedOperationException(Video.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (video == null) {
        throw new IllegalArgumentException("Argument \"video\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("video", video);
    } else {
      throw new IllegalArgumentException("Required argument \"video\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PlayerFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    PlayerFragmentArgs __result = new PlayerFragmentArgs();
    if (savedStateHandle.contains("folderId")) {
      long folderId;
      folderId = savedStateHandle.get("folderId");
      __result.arguments.put("folderId", folderId);
    } else {
      throw new IllegalArgumentException("Required argument \"folderId\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("position")) {
      int position;
      position = savedStateHandle.get("position");
      __result.arguments.put("position", position);
    } else {
      throw new IllegalArgumentException("Required argument \"position\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("video")) {
      Video video;
      video = savedStateHandle.get("video");
      if (video == null) {
        throw new IllegalArgumentException("Argument \"video\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("video", video);
    } else {
      throw new IllegalArgumentException("Required argument \"video\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public long getFolderId() {
    return (long) arguments.get("folderId");
  }

  @SuppressWarnings("unchecked")
  public int getPosition() {
    return (int) arguments.get("position");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Video getVideo() {
    return (Video) arguments.get("video");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("folderId")) {
      long folderId = (long) arguments.get("folderId");
      __result.putLong("folderId", folderId);
    }
    if (arguments.containsKey("position")) {
      int position = (int) arguments.get("position");
      __result.putInt("position", position);
    }
    if (arguments.containsKey("video")) {
      Video video = (Video) arguments.get("video");
      if (Parcelable.class.isAssignableFrom(Video.class) || video == null) {
        __result.putParcelable("video", Parcelable.class.cast(video));
      } else if (Serializable.class.isAssignableFrom(Video.class)) {
        __result.putSerializable("video", Serializable.class.cast(video));
      } else {
        throw new UnsupportedOperationException(Video.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("folderId")) {
      long folderId = (long) arguments.get("folderId");
      __result.set("folderId", folderId);
    }
    if (arguments.containsKey("position")) {
      int position = (int) arguments.get("position");
      __result.set("position", position);
    }
    if (arguments.containsKey("video")) {
      Video video = (Video) arguments.get("video");
      if (Parcelable.class.isAssignableFrom(Video.class) || video == null) {
        __result.set("video", Parcelable.class.cast(video));
      } else if (Serializable.class.isAssignableFrom(Video.class)) {
        __result.set("video", Serializable.class.cast(video));
      } else {
        throw new UnsupportedOperationException(Video.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    PlayerFragmentArgs that = (PlayerFragmentArgs) object;
    if (arguments.containsKey("folderId") != that.arguments.containsKey("folderId")) {
      return false;
    }
    if (getFolderId() != that.getFolderId()) {
      return false;
    }
    if (arguments.containsKey("position") != that.arguments.containsKey("position")) {
      return false;
    }
    if (getPosition() != that.getPosition()) {
      return false;
    }
    if (arguments.containsKey("video") != that.arguments.containsKey("video")) {
      return false;
    }
    if (getVideo() != null ? !getVideo().equals(that.getVideo()) : that.getVideo() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (int)(getFolderId() ^ (getFolderId() >>> 32));
    result = 31 * result + getPosition();
    result = 31 * result + (getVideo() != null ? getVideo().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "PlayerFragmentArgs{"
        + "folderId=" + getFolderId()
        + ", position=" + getPosition()
        + ", video=" + getVideo()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull PlayerFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(long folderId, int position, @NonNull Video video) {
      this.arguments.put("folderId", folderId);
      this.arguments.put("position", position);
      if (video == null) {
        throw new IllegalArgumentException("Argument \"video\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("video", video);
    }

    @NonNull
    public PlayerFragmentArgs build() {
      PlayerFragmentArgs result = new PlayerFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setFolderId(long folderId) {
      this.arguments.put("folderId", folderId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPosition(int position) {
      this.arguments.put("position", position);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setVideo(@NonNull Video video) {
      if (video == null) {
        throw new IllegalArgumentException("Argument \"video\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("video", video);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public long getFolderId() {
      return (long) arguments.get("folderId");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getPosition() {
      return (int) arguments.get("position");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Video getVideo() {
      return (Video) arguments.get("video");
    }
  }
}
