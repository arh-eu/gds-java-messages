package hu.arh.gds.message.data;

import hu.arh.gds.message.util.Packable;

import java.util.*;

public interface AttachmentResultHolder extends Packable {
    List<String> getRequestIds();
    String getOwnerTable();
    String getAttachmentId();
    List<String> getOwnerIds();
    String getMeta();
    Long getTtl();
    Long getToValid();
    byte[] getAttachment();
}
