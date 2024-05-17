package com.lasuak.kvplayer.ui.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.lasuak.kvplayer.R;
import com.lasuak.kvplayer.model.Video;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FolderFragmentDirections {
  private FolderFragmentDirections() {
  }

  @NonNull
  public static ActionFolderFragmentToVideoFragment actionFolderFragmentToVideoFragment(
      long folderId, @NonNull String folderName) {
    return new ActionFolderFragmentToVideoFragment(folderId, folderName);
  }

  @NonNull
  public static ActionFolderFragmentToPlayerFragment actionFolderFragmentToPlayerFragment(
      long folderId, int position, @NonNull Video video) {
    return new ActionFolderFragmentToPlayerFragment(folderId, position, video);
  }

  public static class ActionFolderFragmentToVideoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionFolderFragmentToVideoFragment(long folderId, @NonNull String folderName) {
      this.arguments.put("folderId", folderId);
      if (folderName == null) {
        throw new IllegalArgumentException("Argument \"folderName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("folderName", folderName);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFolderFragmentToVideoFragment setFolderId(long folderId) {
      this.arguments.put("folderId", folderId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFolderFragmentToVideoFragment setFolderName(@NonNull String folderName) {
      if (folderName == null) {
        throw new IllegalArgumentException("Argument \"folderName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("folderName", folderName);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("folderId")) {
        long folderId = (long) arguments.get("folderId");
        __result.putLong("folderId", folderId);
      }
      if (arguments.containsKey("folderName")) {
        String folderName = (String) arguments.get("folderName");
        __result.putString("folderName", folderName);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_folderFragment_to_videoFragment;
    }

    @SuppressWarnings("unchecked")
    public long getFolderId() {
      return (long) arguments.get("folderId");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getFolderName() {
      return (String) arguments.get("folderName");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFolderFragmentToVideoFragment that = (ActionFolderFragmentToVideoFragment) object;
      if (arguments.containsKey("folderId") != that.arguments.containsKey("folderId")) {
        return false;
      }
      if (getFolderId() != that.getFolderId()) {
        return false;
      }
      if (arguments.containsKey("folderName") != that.arguments.containsKey("folderName")) {
        return false;
      }
      if (getFolderName() != null ? !getFolderName().equals(that.getFolderName()) : that.getFolderName() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (int)(getFolderId() ^ (getFolderId() >>> 32));
      result = 31 * result + (getFolderName() != null ? getFolderName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFolderFragmentToVideoFragment(actionId=" + getActionId() + "){"
          + "folderId=" + getFolderId()
          + ", folderName=" + getFolderName()
          + "}";
    }
  }

  public static class ActionFolderFragmentToPlayerFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionFolderFragmentToPlayerFragment(long folderId, int position,
        @NonNull Video video) {
      this.arguments.put("folderId", folderId);
      this.arguments.put("position", position);
      if (video == null) {
        throw new IllegalArgumentException("Argument \"video\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("video", video);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFolderFragmentToPlayerFragment setFolderId(long folderId) {
      this.arguments.put("folderId", folderId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFolderFragmentToPlayerFragment setPosition(int position) {
      this.arguments.put("position", position);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionFolderFragmentToPlayerFragment setVideo(@NonNull Video video) {
      if (video == null) {
        throw new IllegalArgumentException("Argument \"video\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("video", video);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_folderFragment_to_playerFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFolderFragmentToPlayerFragment that = (ActionFolderFragmentToPlayerFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFolderFragmentToPlayerFragment(actionId=" + getActionId() + "){"
          + "folderId=" + getFolderId()
          + ", position=" + getPosition()
          + ", video=" + getVideo()
          + "}";
    }
  }
}
