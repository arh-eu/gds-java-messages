package hu.arh.gds.message.data;

import hu.arh.gds.message.util.ReadException;
import hu.arh.gds.message.util.ValidationException;

import java.io.IOException;

public abstract class MessageData2Event extends MessageData implements MessageData2EventDescriptor {

    public MessageData2Event(byte[] binary, boolean cache) throws IOException, ReadException, ValidationException {
        super(binary, cache);
    }

    public MessageData2Event(byte[] binary, boolean cache, boolean isFullMessage) throws IOException, ReadException, ValidationException {
        super(binary, cache, isFullMessage);
    }

    public MessageData2Event() throws IOException { }
}
