// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client/im_ptc_pong.proto

package com.akaxin.proto.client;

public final class ImPtcPongProto {
  private ImPtcPongProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ImPtcPongRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:client.ImPtcPongRequest)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   *pong操作不需要request实体
   * </pre>
   *
   * Protobuf type {@code client.ImPtcPongRequest}
   */
  public  static final class ImPtcPongRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:client.ImPtcPongRequest)
      ImPtcPongRequestOrBuilder {
    // Use ImPtcPongRequest.newBuilder() to construct.
    private ImPtcPongRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ImPtcPongRequest() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ImPtcPongRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akaxin.proto.client.ImPtcPongProto.internal_static_client_ImPtcPongRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.client.ImPtcPongProto.internal_static_client_ImPtcPongRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest.class, com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest)) {
        return super.equals(obj);
      }
      com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest other = (com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest) obj;

      boolean result = true;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *pong操作不需要request实体
     * </pre>
     *
     * Protobuf type {@code client.ImPtcPongRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:client.ImPtcPongRequest)
        com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.client.ImPtcPongProto.internal_static_client_ImPtcPongRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.client.ImPtcPongProto.internal_static_client_ImPtcPongRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest.class, com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest.Builder.class);
      }

      // Construct using com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.client.ImPtcPongProto.internal_static_client_ImPtcPongRequest_descriptor;
      }

      public com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest getDefaultInstanceForType() {
        return com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest.getDefaultInstance();
      }

      public com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest build() {
        com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest buildPartial() {
        com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest result = new com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest) {
          return mergeFrom((com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest other) {
        if (other == com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest.getDefaultInstance()) return this;
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:client.ImPtcPongRequest)
    }

    // @@protoc_insertion_point(class_scope:client.ImPtcPongRequest)
    private static final com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest();
    }

    public static com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ImPtcPongRequest>
        PARSER = new com.google.protobuf.AbstractParser<ImPtcPongRequest>() {
      public ImPtcPongRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImPtcPongRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ImPtcPongRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImPtcPongRequest> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.client.ImPtcPongProto.ImPtcPongRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_client_ImPtcPongRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_client_ImPtcPongRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030client/im_ptc_pong.proto\022\006client\032\017core" +
      "/core.proto\"\022\n\020ImPtcPongRequest2H\n\020ImPtc" +
      "PongService\0224\n\004pong\022\030.client.ImPtcPongRe" +
      "quest\032\022.core.NoneResponseB)\n\027com.akaxin." +
      "proto.clientB\016ImPtcPongProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.akaxin.proto.core.CoreProto.getDescriptor(),
        }, assigner);
    internal_static_client_ImPtcPongRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_client_ImPtcPongRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_client_ImPtcPongRequest_descriptor,
        new java.lang.String[] { });
    com.akaxin.proto.core.CoreProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
