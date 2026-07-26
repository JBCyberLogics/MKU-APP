package ke.ac.mku.authcore.bootstrap;

@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0097\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0003\b\u0084\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0088\u0005\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001\u00a0\u0001\u00a1\u0001\u00a2\u0001\u00a3\u0001\u00a4\u0001\u00a5\u0001\u00a6\u0001\u00a7\u0001\u00a8\u0001\u00a9\u0001\u00aa\u0001\u00ab\u0001\u00ac\u0001\u00ad\u0001\u00ae\u0001\u00af\u0001\u00b0\u0001\u00b1\u0001\u00b2\u0001\u00b3\u0001\u00b4\u0001\u00b5\u0001\u00b6\u0001\u00b7\u0001\u00b8\u0001\u00b9\u0001\u00ba\u0001\u00bb\u0001\u00bc\u0001\u00bd\u0001\u00be\u0001\u00bf\u0001\u00c0\u0001\u00c1\u0001\u00c2\u0001\u00c3\u0001\u00c4\u0001\u00c5\u0001\u00c6\u0001\u00c7\u0001\u00c8\u0001\u00c9\u0001\u00ca\u0001\u00cb\u0001\u00cc\u0001\u00cd\u0001\u00ce\u0001\u00cf\u0001\u00d0\u0001\u00d1\u0001\u00d2\u0001\u00d3\u0001\u00d4\u0001\u00d5\u0001\u00d6\u0001\u00d7\u0001\u00d8\u0001\u00d9\u0001\u00da\u0001\u00db\u0001\u00dc\u0001\u00dd\u0001\u00de\u0001\u00df\u0001\u00e0\u0001\u00e1\u0001\u00e2\u0001\u00e3\u0001\u00e4\u0001\u00e5\u0001\u00e6\u0001\u00e7\u0001\u00e8\u0001\u00e9\u0001\u00ea\u0001\u00eb\u0001\u00ec\u0001\u00ed\u0001\u00ee\u0001\u00ef\u0001\u00f0\u0001\u00f1\u0001\u00f2\u0001\u00f3\u0001\u00f4\u0001\u00f5\u0001\u00f6\u0001\u00f7\u0001\u00f8\u0001\u00f9\u0001\u00fa\u0001\u00fb\u0001\u00fc\u0001\u00fd\u0001\u00fe\u0001\u00ff\u0001\u0080\u0002\u0081\u0002\u0082\u0002\u0083\u0002\u0084\u0002\u0085\u0002\u0086\u0002\u0087\u0002\u0088\u0002\u0089\u0002\u008a\u0002\u008b\u0002\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002\u0095\u0002\u0096\u0002\u0097\u0002\u0098\u0002\u0099\u0002\u009a\u0002\u009b\u0002\u009c\u0002\u009d\u0002\u009e\u0002\u009f\u0002\u00a0\u0002\u00a1\u0002\u00a2\u0002\u00a3\u0002\u00a4\u0002\u00a5\u0002\u00a6\u0002\u00a7\u0002\u00a8\u0002\u00a9\u0002\u00aa\u0002\u00ab\u0002\u00ac\u0002\u00ad\u0002\u00ae\u0002\u00af\u0002\u00b0\u0002\u00b1\u0002\u00b2\u0002\u00b3\u0002\u00b4\u0002\u00b5\u0002\u00b6\u0002\u00b7\u0002\u00b8\u0002\u00b9\u0002\u00ba\u0002\u00bb\u0002\u00bc\u0002\u00bd\u0002\u00be\u0002\u00bf\u0002\u00c0\u0002\u00c1\u0002\u00c2\u0002\u00c3\u0002\u00c4\u0002\u00c5\u0002\u00c6\u0002\u00c7\u0002\u00c8\u0002\u00c9\u0002\u00ca\u0002\u00cb\u0002\u00cc\u0002\u00cd\u0002\u00ce\u0002\u00cf\u0002\u00d0\u0002\u00d1\u0002\u00d2\u0002\u00d3\u0002\u00d4\u0002\u00d5\u0002\u00d6\u0002\u00d7\u0002\u00d8\u0002\u00d9\u0002\u00da\u0002\u00db\u0002\u00dc\u0002\u00dd\u0002\u00de\u0002\u00df\u0002\u00e0\u0002\u00e1\u0002\u00e2\u0002\u00e3\u0002\u00e4\u0002\u00e5\u0002\u00e6\u0002\u00e7\u0002\u00e8\u0002\u00e9\u0002\u00ea\u0002\u00eb\u0002\u00ec\u0002\u00ed\u0002\u00ee\u0002\u00ef\u0002\u00f0\u0002\u00f1\u0002\u00f2\u0002\u00f3\u0002\u00f4\u0002\u00f5\u0002\u00f6\u0002\u00f7\u0002\u00f8\u0002\u00f9\u0002\u00fa\u0002\u00fb\u0002\u00fc\u0002\u00fd\u0002\u00fe\u0002\u00ff\u0002\u0080\u0003\u0081\u0003\u0082\u0003\u0083\u0003\u0084\u0003\u0085\u0003B\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0084\u0006\u0086\u0003\u0087\u0003\u0088\u0003\u0089\u0003\u008a\u0003\u008b\u0003\u008c\u0003\u008d\u0003\u008e\u0003\u008f\u0003\u0090\u0003\u0091\u0003\u0092\u0003\u0093\u0003\u0094\u0003\u0095\u0003\u0096\u0003\u0097\u0003\u0098\u0003\u0099\u0003\u009a\u0003\u009b\u0003\u009c\u0003\u009d\u0003\u009e\u0003\u009f\u0003\u00a0\u0003\u00a1\u0003\u00a2\u0003\u00a3\u0003\u00a4\u0003\u00a5\u0003\u00a6\u0003\u00a7\u0003\u00a8\u0003\u00a9\u0003\u00aa\u0003\u00ab\u0003\u00ac\u0003\u00ad\u0003\u00ae\u0003\u00af\u0003\u00b0\u0003\u00b1\u0003\u00b2\u0003\u00b3\u0003\u00b4\u0003\u00b5\u0003\u00b6\u0003\u00b7\u0003\u00b8\u0003\u00b9\u0003\u00ba\u0003\u00bb\u0003\u00bc\u0003\u00bd\u0003\u00be\u0003\u00bf\u0003\u00c0\u0003\u00c1\u0003\u00c2\u0003\u00c3\u0003\u00c4\u0003\u00c5\u0003\u00c6\u0003\u00c7\u0003\u00c8\u0003\u00c9\u0003\u00ca\u0003\u00cb\u0003\u00cc\u0003\u00cd\u0003\u00ce\u0003\u00cf\u0003\u00d0\u0003\u00d1\u0003\u00d2\u0003\u00d3\u0003\u00d4\u0003\u00d5\u0003\u00d6\u0003\u00d7\u0003\u00d8\u0003\u00d9\u0003\u00da\u0003\u00db\u0003\u00dc\u0003\u00dd\u0003\u00de\u0003\u00df\u0003\u00e0\u0003\u00e1\u0003\u00e2\u0003\u00e3\u0003\u00e4\u0003\u00e5\u0003\u00e6\u0003\u00e7\u0003\u00e8\u0003\u00e9\u0003\u00ea\u0003\u00eb\u0003\u00ec\u0003\u00ed\u0003\u00ee\u0003\u00ef\u0003\u00f0\u0003\u00f1\u0003\u00f2\u0003\u00f3\u0003\u00f4\u0003\u00f5\u0003\u00f6\u0003\u00f7\u0003\u00f8\u0003\u00f9\u0003\u00fa\u0003\u00fb\u0003\u00fc\u0003\u00fd\u0003\u00fe\u0003\u00ff\u0003\u0080\u0004\u0081\u0004\u0082\u0004\u0083\u0004\u0084\u0004\u0085\u0004\u0086\u0004\u0087\u0004\u0088\u0004\u0089\u0004\u008a\u0004\u008b\u0004\u008c\u0004\u008d\u0004\u008e\u0004\u008f\u0004\u0090\u0004\u0091\u0004\u0092\u0004\u0093\u0004\u0094\u0004\u0095\u0004\u0096\u0004\u0097\u0004\u0098\u0004\u0099\u0004\u009a\u0004\u009b\u0004\u009c\u0004\u009d\u0004\u009e\u0004\u009f\u0004\u00a0\u0004\u00a1\u0004\u00a2\u0004\u00a3\u0004\u00a4\u0004\u00a5\u0004\u00a6\u0004\u00a7\u0004\u00a8\u0004\u00a9\u0004\u00aa\u0004\u00ab\u0004\u00ac\u0004\u00ad\u0004\u00ae\u0004\u00af\u0004\u00b0\u0004\u00b1\u0004\u00b2\u0004\u00b3\u0004\u00b4\u0004\u00b5\u0004\u00b6\u0004\u00b7\u0004\u00b8\u0004\u00b9\u0004\u00ba\u0004\u00bb\u0004\u00bc\u0004\u00bd\u0004\u00be\u0004\u00bf\u0004\u00c0\u0004\u00c1\u0004\u00c2\u0004\u00c3\u0004\u00c4\u0004\u00c5\u0004\u00c6\u0004\u00c7\u0004\u00c8\u0004\u00c9\u0004\u00ca\u0004\u00cb\u0004\u00cc\u0004\u00cd\u0004\u00ce\u0004\u00cf\u0004\u00d0\u0004\u00d1\u0004\u00d2\u0004\u00d3\u0004\u00d4\u0004\u00d5\u0004\u00d6\u0004\u00d7\u0004\u00d8\u0004\u00d9\u0004\u00da\u0004\u00db\u0004\u00dc\u0004\u00dd\u0004\u00de\u0004\u00df\u0004\u00e0\u0004\u00e1\u0004\u00e2\u0004\u00e3\u0004\u00e4\u0004\u00e5\u0004\u00e6\u0004\u00e7\u0004\u00e8\u0004\u00e9\u0004\u00ea\u0004\u00eb\u0004\u00ec\u0004\u00ed\u0004\u00ee\u0004\u00ef\u0004\u00f0\u0004\u00f1\u0004\u00f2\u0004\u00f3\u0004\u00f4\u0004\u00f5\u0004\u00f6\u0004\u00f7\u0004\u00f8\u0004\u00f9\u0004\u00fa\u0004\u00fb\u0004\u00fc\u0004\u00fd\u0004\u00fe\u0004\u00ff\u0004\u0080\u0005\u0081\u0005\u0082\u0005\u0083\u0005\u0084\u0005\u0085\u0005\u0086\u0005\u0087\u0005\u0088\u0005\u0089\u0005\u008a\u0005\u008b\u0005\u008c\u0005\u008d\u0005\u008e\u0005\u008f\u0005\u0090\u0005\u0091\u0005\u0092\u0005\u0093\u0005\u0094\u0005\u0095\u0005\u0096\u0005\u0097\u0005\u0098\u0005\u0099\u0005\u009a\u0005\u009b\u0005\u009c\u0005\u009d\u0005\u009e\u0005\u009f\u0005\u00a0\u0005\u00a1\u0005\u00a2\u0005\u00a3\u0005\u00a4\u0005\u00a5\u0005\u00a6\u0005\u00a7\u0005\u00a8\u0005\u00a9\u0005\u00aa\u0005\u00ab\u0005\u00ac\u0005\u00ad\u0005\u00ae\u0005\u00af\u0005\u00b0\u0005\u00b1\u0005\u00b2\u0005\u00b3\u0005\u00b4\u0005\u00b5\u0005\u00b6\u0005\u00b7\u0005\u00b8\u0005\u00b9\u0005\u00ba\u0005\u00bb\u0005\u00bc\u0005\u00bd\u0005\u00be\u0005\u00bf\u0005\u00c0\u0005\u00c1\u0005\u00c2\u0005\u00c3\u0005\u00c4\u0005\u00c5\u0005\u00c6\u0005\u00c7\u0005\u00c8\u0005\u00c9\u0005\u00ca\u0005\u00cb\u0005\u00cc\u0005\u00cd\u0005\u00ce\u0005\u00cf\u0005\u00d0\u0005\u00d1\u0005\u00d2\u0005\u00d3\u0005\u00d4\u0005\u00d5\u0005\u00d6\u0005\u00d7\u0005\u00d8\u0005\u00d9\u0005\u00da\u0005\u00db\u0005\u00dc\u0005\u00dd\u0005\u00de\u0005\u00df\u0005\u00e0\u0005\u00e1\u0005\u00e2\u0005\u00e3\u0005\u00e4\u0005\u00e5\u0005\u00e6\u0005\u00e7\u0005\u00e8\u0005\u00e9\u0005\u00ea\u0005\u00eb\u0005\u00ec\u0005\u00ed\u0005\u00ee\u0005\u00ef\u0005\u00f0\u0005\u00f1\u0005\u00f2\u0005\u00f3\u0005\u00f4\u0005\u00f5\u0005\u00f6\u0005\u00f7\u0005\u00f8\u0005\u00f9\u0005\u00fa\u0005\u00fb\u0005\u00fc\u0005\u00fd\u0005\u00fe\u0005\u00ff\u0005\u0080\u0006\u0081\u0006\u0082\u0006\u0083\u0006\u0084\u0006\u0085\u0006\u0086\u0006\u0087\u0006\u00a8\u0006\u0088\u0006"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "", "<init>", "()V", "BootstrapStarted", "ConfigurationLoaded", "ConfigurationValidated", "AuthenticationCoreInitialized", "DependenciesResolved", "BootstrapCompleted", "BootstrapFailed", "PlatformValidationStarted", "PlatformValidationStepCompleted", "PlatformValidationFailed", "PlatformValidationCompleted", "DashboardLaunchStarted", "RegistryReady", "ServiceRegistered", "ServiceResolved", "ServiceRegistrationFailed", "KeystoreOperationRetried", "KeystoreRecovered", "KeystoreRecoveryFailed", "StateInitialized", "StateChanged", "StateRestored", "StateReset", "StateValidationFailed", "FeatureRegistered", "FeatureEnabled", "FeatureDisabled", "FeatureRegistryReady", "FeatureValidationFailed", "RuntimeInitialized", "RuntimeReady", "RuntimeShutdown", "ResourceWarning", "MemoryPressureDetected", "RuntimeFailure", "HealthMonitorReady", "HealthStatusChanged", "ComponentFailed", "ComponentRecovered", "MemoryWarning", "CpuWarning", "NetworkWarning", "AuthenticationWarning", "RuntimeWarning", "CriticalFailure", "DiagnosticReportGenerated", "RecoveryManagerReady", "RecoveryStarted", "RecoveryCompleted", "RecoveryFailed", "ServiceRestartRequested", "ServiceRestarted", "ReinitializeServiceRequested", "RollbackRequested", "RollbackCompleted", "RetryStarted", "RetryFailed", "CircuitOpened", "CircuitClosed", "SystemRecovered", "CircuitStateChanged", "SecureStorageReady", "CryptoManagerReady", "TrustManagerReady", "SecurityMonitorReady", "ThreatDetectorReady", "SecurityPlatformReady", "SecurityValidationCompleted", "StorageInitialized", "DataStored", "DataRetrieved", "DataDeleted", "StorageCleared", "IntegrityVerified", "IntegrityFailed", "StorageFailure", "CacheExpired", "CertificateVerified", "CertificateValidationFailed", "CertificatePinVerified", "CertificatePinFailed", "TrustViolationDetected", "SecureConnectionEstablished", "TlsHandshakeCompleted", "ThreatDetected", "SecurityWarning", "SecurityIncidentCreated", "PlatformIntegrityVerified", "IntegrityFailure", "AuditRecorded", "SecurityScanCompleted", "SecurityReportGenerated", "AuthenticationStarted", "AuthenticationProcessing", "AuthenticationSuccess", "AuthenticationFailed", "AuthenticationCancelled", "AuthenticationRetrying", "AuthenticationCompleted", "LoginWorkflowStarted", "LoginWorkflowProcessing", "LoginAuthenticated", "LoginSessionCreated", "LoginPortalConnected", "LoginCompleted", "LoginFailed", "LoginCancelled", "LogoutCompleted", "AuthenticationStateInitialized", "AuthenticationStateChanged", "AuthenticationStateRestored", "AuthenticationStatePersisted", "AuthenticationStateExpired", "AuthenticationStateFailed", "AuthenticationStateRecovered", "AuthenticationReady", "SessionCreating", "SessionCreated", "SessionRestoring", "SessionRestored", "SessionRefreshing", "SessionRefreshed", "SessionValidating", "SessionExpiring", "SessionExpired", "SessionTerminating", "SessionTerminated", "SessionFailed", "SessionRecovered", "SessionValidationStarted", "SessionValidationPassed", "SessionValidationWarning", "SessionValidationFailed", "SessionIntegrityVerified", "SessionIntegrityFailed", "SessionExpiredDetected", "SessionRecoveryRequired", "SessionValidatorReady", "ApplicationRestarted", "NetworkRecovered", "DeviceUnlocked", "ApplicationCrashed", "ProcessRecreated", "RecoveryRequested", "SessionRecoveryStarted", "SessionBackupLoaded", "SessionRestorationStarted", "SessionRestoredFromBackup", "SessionReauthenticated", "SessionRecoveryCompleted", "SessionRecoveryFailed", "SessionRecreated", "SessionRecoveryAborted", "SessionPlatformReady", "CookieCreated", "CookieUpdated", "CookieDeleted", "CookieExpired", "CookieValidationStarted", "CookieValidationPassed", "CookieValidationFailed", "CookieStoreCleared", "CookieManagerReady", "CookieSynchronizationStarted", "CookieSynchronizationCompleted", "CookieSynchronizationFailed", "CookieConflictDetected", "CookieConflictResolved", "CookieConsistencyVerified", "CookiePlatformReady", "NetworkReady", "RequestPipelineReady", "ResponseReceived", "ResponseProcessed", "NetworkPlatformReady", "NetworkInitializing", "NetworkOnline", "NetworkOffline", "NetworkConnecting", "NetworkDisconnected", "NetworkRecoveryStarted", "NetworkRecoveryCompleted", "NetworkFailed", "RequestReceived", "RequestValidated", "RequestEnriched", "RequestSigned", "RequestReady", "PipelineValidationFailed", "PipelineExecutionFailed", "AuthenticationNetworkReady", "ResponseFailed", "ResponseValidated", "CookiesUpdated", "SessionUpdated", "NetworkConnected", "ApplicationResumed", "PortalDiscoveryStarted", "PortalDiscoveryCompleted", "NavigationDiscoveryStarted", "NavigationDiscoveryCompleted", "RequestDiscoveryStarted", "RequestDiscoveryCompleted", "PortalMonitorStarted", "PortalReady", "PortalPlatformReady", "PortalInitializing", "PortalConnecting", "PortalConnected", "PortalAuthenticated", "PortalDisconnected", "PortalReconnecting", "PortalConnectionFailed", "PortalMappingStarted", "PortalMappingCompleted", "PortalMappingFailed", "DomainModelCreated", "SchemaValidationFailed", "PortalMapperReady", "PortalSyncStarted", "PortalSyncCompleted", "PortalSyncFailed", "PortalConflictDetected", "PortalConflictResolved", "PortalStateUpdated", "PortalConsistencyVerified", "PortalPageDiscovered", "PortalNavigationDiscovered", "PortalModuleDiscovered", "PortalMapUpdated", "PortalDiscoveryFailed", "NavigationNodeDiscovered", "MenuDiscovered", "NavigationGraphUpdated", "NavigationDiscoveryFailed", "PortalVersionChanged", "PortalStructureChanged", "PortalNavigationChanged", "PortalEndpointChanged", "PortalSchemaChanged", "PortalRediscoveryStarted", "PortalRediscoveryCompleted", "PortalAdaptationCompleted", "PortalMonitorFailed", "EndpointDiscoveryStarted", "EndpointDiscoveryCompleted", "EndpointValidationFailed", "EndpointRegistered", "EndpointCacheUpdated", "EndpointRegistryReady", "EndpointHealthCheckStarted", "EndpointHealthy", "EndpointDegraded", "EndpointUnreachable", "EndpointRecovered", "EndpointFailed", "CertificateExpiring", "FailoverInitiated", "AuthenticationPlatformReady", "EndpointDiscovered", "RequestCaptured", "CsrfTokenDiscovered", "RequestRegistryUpdated", "DomAnalysisStarted", "DocumentParsed", "SemanticDomCreated", "TablesDetected", "FormsDetected", "CardsDetected", "DomAnalysisCompleted", "DomAnalysisFailed", "SemanticClassificationStarted", "EntityClassified", "UnknownEntityDetected", "ClassificationCompleted", "SemanticRegistryUpdated", "ClassificationFailed", "JsonGenerationStarted", "SchemaGenerated", "EntitySerialized", "JsonValidated", "NormalizedJsonCreated", "DashboardDatasetCreated", "JsonValidationCompleted", "PortalJsonReady", "JsonGenerationCompleted", "JsonGenerationFailed", "RelationshipEngineStarted", "EntityLinked", "RelationshipCreated", "GraphUpdated", "GraphValidated", "RelationshipEngineCompleted", "RelationshipEngineFailed", "KnowledgeGraphStarted", "KnowledgeNodeCreated", "KnowledgeEdgeCreated", "ReasoningCompleted", "KnowledgeGraphUpdated", "StudentContextSeedReady", "KnowledgeGraphCompleted", "KnowledgeGraphFailed", "StudentContextStarted", "StudentContextUpdated", "AcademicContextChanged", "FinancialContextChanged", "LearningContextChanged", "PriorityChanged", "StudentContextReady", "StudentContextFailed", "ContextSyncStarted", "ContextDeltaDetected", "ContextUpdated", "DashboardDeltaReady", "ContextSyncCompleted", "ContextSyncFailed", "ContextCacheStarted", "SnapshotCreated", "ContextCached", "OfflineContextLoaded", "CacheRestored", "CacheCleanupCompleted", "ContextCacheCompleted", "ContextCacheFailed", "ContextValidationStarted", "ValidationCompleted", "ValidationWarning", "ContextRepaired", "DashboardContextReady", "LayerThreeCompleted", "ContextValidationFailed", "WidgetRegistryStarted", "WidgetRegistered", "WidgetRemoved", "WidgetPriorityChanged", "DashboardBlueprintCreated", "WidgetRegistryCompleted", "WidgetRegistryFailed", "DashboardGenerationStarted", "WidgetOrderFinalized", "RecommendationsGenerated", "DashboardReadyForLayout", "DashboardGenerationCompleted", "DashboardGenerationFailed", "LayoutGenerationStarted", "ResponsiveGridCreated", "LayoutOptimized", "RenderTreeGenerated", "LayoutReady", "LayoutGenerationCompleted", "LayoutGenerationFailed", "MotionEngineStarted", "AnimationPlanGenerated", "TransitionCompleted", "WidgetAnimationFinished", "DashboardAnimationReady", "MotionEngineCompleted", "MotionEngineFailed", "DashboardRenderStarted", "DashboardCreated", "WidgetRendered", "DashboardUpdated", "IncrementalRenderCompleted", "DashboardReady", "DashboardRenderFailed", "NewResultsAvailable", "FeeBalanceChanged", "PaymentRecorded", "RegistrationOpened", "RegistrationClosed", "NewTimetableAvailable", "ExamScheduleUpdated", "CatScheduleChanged", "LibraryDueSoon", "LibraryOverdue", "HostelInformationChanged", "NewAnnouncement", "NewDocumentAvailable", "DashboardRefreshRequired", "StudentContextChanged", "ContextEventCreated", "PriorityEventDispatched", "DashboardRefreshPlanned", "NotificationGenerated", "ContextEventCompleted", "ContextEventFailed", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AcademicContextChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AnimationPlanGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ApplicationCrashed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ApplicationRestarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ApplicationResumed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuditRecorded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCancelled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCoreInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationNetworkReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationProcessing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationRetrying;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStatePersisted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationSuccess;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CacheCleanupCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CacheExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CacheRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CardsDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CatScheduleChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateExpiring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificatePinFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificatePinVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitClosed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitOpened;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitStateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ClassificationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ClassificationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ComponentFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ComponentRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ConfigurationLoaded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ConfigurationValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextCacheCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextCacheFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextCacheStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextCached;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextDeltaDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextEventCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextEventCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextEventFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextRepaired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextSyncCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextSyncFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextSyncStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextValidationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieConflictDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieConflictResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieConsistencyVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieDeleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookiePlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieStoreCleared;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieSynchronizationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieSynchronizationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieSynchronizationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieValidationPassed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieValidationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookiesUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CpuWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CriticalFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CryptoManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CsrfTokenDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardAnimationReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardBlueprintCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardContextReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardDatasetCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardDeltaReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardGenerationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardGenerationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardGenerationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardLaunchStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardReadyForLayout;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardRefreshPlanned;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardRefreshRequired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardRenderFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardRenderStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataDeleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataRetrieved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataStored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DependenciesResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DeviceUnlocked;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DiagnosticReportGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DocumentParsed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DomAnalysisCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DomAnalysisFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DomAnalysisStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DomainModelCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointCacheUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointDegraded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointDiscoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointDiscoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointHealthCheckStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointHealthy;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointRegistryReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointUnreachable;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EntityClassified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EntityLinked;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EntitySerialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ExamScheduleUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FailoverInitiated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureDisabled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureEnabled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureRegistryReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeeBalanceChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FinancialContextChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FormsDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$GraphUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$GraphValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$HealthMonitorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$HealthStatusChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$HostelInformationChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IncrementalRenderCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$JsonGenerationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$JsonGenerationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$JsonGenerationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$JsonValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$JsonValidationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KeystoreOperationRetried;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KeystoreRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KeystoreRecoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeEdgeCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeGraphCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeGraphFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeGraphStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeGraphUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeNodeCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayerThreeCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayoutGenerationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayoutGenerationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayoutGenerationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayoutOptimized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayoutReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LearningContextChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LibraryDueSoon;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LibraryOverdue;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginAuthenticated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginCancelled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginPortalConnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginSessionCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginWorkflowProcessing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginWorkflowStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LogoutCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MemoryPressureDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MemoryWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MenuDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MotionEngineCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MotionEngineFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MotionEngineStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NavigationDiscoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NavigationDiscoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NavigationDiscoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NavigationGraphUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NavigationNodeDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkConnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkConnecting;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkDisconnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkInitializing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkOffline;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkOnline;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkRecoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkRecoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NewAnnouncement;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NewDocumentAvailable;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NewResultsAvailable;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NewTimetableAvailable;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NormalizedJsonCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NotificationGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$OfflineContextLoaded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PaymentRecorded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PipelineExecutionFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PipelineValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformIntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformValidationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformValidationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformValidationStepCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalAdaptationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalAuthenticated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConflictDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConflictResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConnecting;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConnectionFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConsistencyVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalDisconnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalDiscoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalDiscoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalDiscoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalEndpointChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalInitializing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalJsonReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMapUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMapperReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMappingCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMappingFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMappingStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalModuleDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMonitorFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMonitorStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalNavigationChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalNavigationDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalPageDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalReconnecting;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalRediscoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalRediscoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalSchemaChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalStateUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalStructureChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalSyncCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalSyncFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalSyncStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalVersionChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PriorityChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PriorityEventDispatched;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ProcessRecreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ReasoningCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecommendationsGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RegistrationClosed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RegistrationOpened;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RegistryReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ReinitializeServiceRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RelationshipCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RelationshipEngineCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RelationshipEngineFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RelationshipEngineStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RenderTreeGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestCaptured;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestDiscoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestDiscoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestEnriched;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestPipelineReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestReceived;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestRegistryUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestSigned;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResourceWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResponseFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResponseProcessed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResponseReceived;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResponseValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResponsiveGridCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RetryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RetryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RollbackCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RollbackRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeShutdown;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SchemaGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SchemaValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecureConnectionEstablished;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecureStorageReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityIncidentCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityMonitorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityReportGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityScanCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityValidationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SemanticClassificationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SemanticDomCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SemanticRegistryUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRegistrationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRestartRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRestarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionBackupLoaded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionCreating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpiredDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpiring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionIntegrityFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionIntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionReauthenticated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryAborted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryRequired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRefreshed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRefreshing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestorationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestoredFromBackup;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestoring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionTerminated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionTerminating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationPassed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidatorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SnapshotCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateReset;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageCleared;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextSeedReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SystemRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TablesDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ThreatDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ThreatDetectorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TlsHandshakeCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TransitionCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TrustManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TrustViolationDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$UnknownEntityDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ValidationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ValidationWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetAnimationFinished;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetOrderFinalized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetPriorityChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRegistryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRegistryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRegistryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRemoved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRendered;", "app"})
public abstract class BootstrapEvent {
    
    private BootstrapEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AcademicContextChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class AcademicContextChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AcademicContextChanged INSTANCE = null;
        
        private AcademicContextChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AnimationPlanGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class AnimationPlanGenerated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AnimationPlanGenerated INSTANCE = null;
        
        private AnimationPlanGenerated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ApplicationCrashed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ApplicationCrashed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ApplicationCrashed INSTANCE = null;
        
        private ApplicationCrashed() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ApplicationRestarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ApplicationRestarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ApplicationRestarted INSTANCE = null;
        
        private ApplicationRestarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ApplicationResumed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ApplicationResumed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ApplicationResumed INSTANCE = null;
        
        private ApplicationResumed() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuditRecorded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"})
    public static final class AuditRecorded extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int count = 0;
        
        public AuditRecorded(int count) {
        }
        
        public final int getCount() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuditRecorded copy(int count) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCancelled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class AuthenticationCancelled extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationCancelled INSTANCE = null;
        
        private AuthenticationCancelled() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class AuthenticationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationCompleted INSTANCE = null;
        
        private AuthenticationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCoreInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class AuthenticationCoreInitialized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationCoreInitialized INSTANCE = null;
        
        private AuthenticationCoreInitialized() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getErrorCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class AuthenticationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorCode = null;
        
        public AuthenticationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, @org.jetbrains.annotations.Nullable()
        java.lang.String errorCode) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, @org.jetbrains.annotations.Nullable()
        java.lang.String errorCode) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationNetworkReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class AuthenticationNetworkReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationNetworkReady INSTANCE = null;
        
        private AuthenticationNetworkReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class AuthenticationPlatformReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationPlatformReady INSTANCE = null;
        
        private AuthenticationPlatformReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationProcessing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "step", "", "<init>", "(Ljava/lang/String;)V", "getStep", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class AuthenticationProcessing extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String step = null;
        
        public AuthenticationProcessing(@org.jetbrains.annotations.NotNull()
        java.lang.String step) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStep() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationProcessing copy(@org.jetbrains.annotations.NotNull()
        java.lang.String step) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class AuthenticationReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationReady INSTANCE = null;
        
        private AuthenticationReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationRetrying;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "attemptNumber", "", "maxAttempts", "<init>", "(II)V", "getAttemptNumber", "()I", "getMaxAttempts", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"})
    public static final class AuthenticationRetrying extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int attemptNumber = 0;
        private final int maxAttempts = 0;
        
        public AuthenticationRetrying(int attemptNumber, int maxAttempts) {
        }
        
        public final int getAttemptNumber() {
            return 0;
        }
        
        public final int getMaxAttempts() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationRetrying copy(int attemptNumber, int maxAttempts) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class AuthenticationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStarted INSTANCE = null;
        
        private AuthenticationStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "previous", "Lke/ac/mku/authcore/state/AuthenticationState;", "current", "<init>", "(Lke/ac/mku/authcore/state/AuthenticationState;Lke/ac/mku/authcore/state/AuthenticationState;)V", "getPrevious", "()Lke/ac/mku/authcore/state/AuthenticationState;", "getCurrent", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"})
    public static final class AuthenticationStateChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState previous = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState current = null;
        
        public AuthenticationStateChanged(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState previous, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState current) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getPrevious() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getCurrent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateChanged copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState previous, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState current) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "previousState", "Lke/ac/mku/authcore/state/AuthenticationState;", "<init>", "(Lke/ac/mku/authcore/state/AuthenticationState;)V", "getPreviousState", "()Lke/ac/mku/authcore/state/AuthenticationState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"})
    public static final class AuthenticationStateExpired extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState previousState = null;
        
        public AuthenticationStateExpired(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState previousState) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getPreviousState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateExpired copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState previousState) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class AuthenticationStateFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public AuthenticationStateFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class AuthenticationStateInitialized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateInitialized INSTANCE = null;
        
        private AuthenticationStateInitialized() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStatePersisted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "state", "Lke/ac/mku/authcore/state/AuthenticationState;", "<init>", "(Lke/ac/mku/authcore/state/AuthenticationState;)V", "getState", "()Lke/ac/mku/authcore/state/AuthenticationState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"})
    public static final class AuthenticationStatePersisted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState state = null;
        
        public AuthenticationStatePersisted(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState state) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStatePersisted copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState state) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "recoveredState", "Lke/ac/mku/authcore/state/AuthenticationState;", "<init>", "(Lke/ac/mku/authcore/state/AuthenticationState;)V", "getRecoveredState", "()Lke/ac/mku/authcore/state/AuthenticationState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"})
    public static final class AuthenticationStateRecovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState recoveredState = null;
        
        public AuthenticationStateRecovered(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState recoveredState) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getRecoveredState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateRecovered copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState recoveredState) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "state", "Lke/ac/mku/authcore/state/AuthenticationState;", "<init>", "(Lke/ac/mku/authcore/state/AuthenticationState;)V", "getState", "()Lke/ac/mku/authcore/state/AuthenticationState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"})
    public static final class AuthenticationStateRestored extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState state = null;
        
        public AuthenticationStateRestored(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState state) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateRestored copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState state) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationSuccess;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "regNumber", "", "studentName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRegNumber", "()Ljava/lang/String;", "getStudentName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class AuthenticationSuccess extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String regNumber = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String studentName = null;
        
        public AuthenticationSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber, @org.jetbrains.annotations.Nullable()
        java.lang.String studentName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRegNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStudentName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationSuccess copy(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber, @org.jetbrains.annotations.Nullable()
        java.lang.String studentName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class AuthenticationWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationWarning INSTANCE = null;
        
        private AuthenticationWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class BootstrapCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.BootstrapCompleted INSTANCE = null;
        
        private BootstrapCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "error", "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class BootstrapFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        public BootstrapFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.BootstrapFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class BootstrapStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.BootstrapStarted INSTANCE = null;
        
        private BootstrapStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CacheCleanupCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CacheCleanupCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CacheCleanupCompleted INSTANCE = null;
        
        private CacheCleanupCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CacheExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "key", "", "ttlMs", "", "<init>", "(Ljava/lang/String;J)V", "getKey", "()Ljava/lang/String;", "getTtlMs", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CacheExpired extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        private final long ttlMs = 0L;
        
        public CacheExpired(@org.jetbrains.annotations.NotNull()
        java.lang.String key, long ttlMs) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        public final long getTtlMs() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CacheExpired copy(@org.jetbrains.annotations.NotNull()
        java.lang.String key, long ttlMs) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CacheRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "snapshotId", "", "<init>", "(Ljava/lang/String;)V", "getSnapshotId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CacheRestored extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String snapshotId = null;
        
        public CacheRestored(@org.jetbrains.annotations.NotNull()
        java.lang.String snapshotId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSnapshotId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CacheRestored copy(@org.jetbrains.annotations.NotNull()
        java.lang.String snapshotId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CardsDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"})
    public static final class CardsDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int count = 0;
        
        public CardsDetected(int count) {
        }
        
        public final int getCount() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CardsDetected copy(int count) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CatScheduleChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CatScheduleChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CatScheduleChanged INSTANCE = null;
        
        private CatScheduleChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateExpiring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "identifier", "", "daysRemaining", "", "<init>", "(Ljava/lang/String;I)V", "getIdentifier", "()Ljava/lang/String;", "getDaysRemaining", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class CertificateExpiring extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String identifier = null;
        private final int daysRemaining = 0;
        
        public CertificateExpiring(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier, int daysRemaining) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIdentifier() {
            return null;
        }
        
        public final int getDaysRemaining() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CertificateExpiring copy(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier, int daysRemaining) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificatePinFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "expectedPin", "actualPin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getExpectedPin", "getActualPin", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CertificatePinFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String expectedPin = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String actualPin = null;
        
        public CertificatePinFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String expectedPin, @org.jetbrains.annotations.NotNull()
        java.lang.String actualPin) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getExpectedPin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getActualPin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CertificatePinFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String expectedPin, @org.jetbrains.annotations.NotNull()
        java.lang.String actualPin) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificatePinVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "<init>", "(Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CertificatePinVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        
        public CertificatePinVerified(@org.jetbrains.annotations.NotNull()
        java.lang.String host) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CertificatePinVerified copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "error", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getError", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CertificateValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String status = null;
        
        public CertificateValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String error, @org.jetbrains.annotations.NotNull()
        java.lang.String status) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CertificateValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String error, @org.jetbrains.annotations.NotNull()
        java.lang.String status) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "fingerprint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getFingerprint", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CertificateVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fingerprint = null;
        
        public CertificateVerified(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String fingerprint) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFingerprint() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CertificateVerified copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String fingerprint) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitClosed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "<init>", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CircuitClosed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public CircuitClosed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CircuitClosed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitOpened;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "<init>", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CircuitOpened extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public CircuitOpened(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CircuitOpened copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitStateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "previousState", "Lke/ac/mku/authcore/recovery/CircuitBreakerState;", "newState", "<init>", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/CircuitBreakerState;Lke/ac/mku/authcore/recovery/CircuitBreakerState;)V", "getServiceName", "()Ljava/lang/String;", "getPreviousState", "()Lke/ac/mku/authcore/recovery/CircuitBreakerState;", "getNewState", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CircuitStateChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.CircuitBreakerState previousState = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.CircuitBreakerState newState = null;
        
        public CircuitStateChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState previousState, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState newState) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState getPreviousState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState getNewState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CircuitStateChanged copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState previousState, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState newState) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ClassificationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ClassificationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ClassificationCompleted INSTANCE = null;
        
        private ClassificationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ClassificationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ClassificationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public ClassificationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ClassificationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ComponentFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "component", "", "<init>", "(Ljava/lang/String;)V", "getComponent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ComponentFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String component = null;
        
        public ComponentFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String component) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getComponent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ComponentFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String component) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ComponentRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "component", "", "<init>", "(Ljava/lang/String;)V", "getComponent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ComponentRecovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String component = null;
        
        public ComponentRecovered(@org.jetbrains.annotations.NotNull()
        java.lang.String component) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getComponent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ComponentRecovered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String component) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ConfigurationLoaded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ConfigurationLoaded extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ConfigurationLoaded INSTANCE = null;
        
        private ConfigurationLoaded() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ConfigurationValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ConfigurationValidated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ConfigurationValidated INSTANCE = null;
        
        private ConfigurationValidated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextCacheCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ContextCacheCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextCacheCompleted INSTANCE = null;
        
        private ContextCacheCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextCacheFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ContextCacheFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public ContextCacheFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextCacheFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextCacheStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ContextCacheStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextCacheStarted INSTANCE = null;
        
        private ContextCacheStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextCached;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ContextCached extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextCached INSTANCE = null;
        
        private ContextCached() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0004H\u00d6\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextDeltaDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domains", "", "", "<init>", "(Ljava/util/List;)V", "getDomains", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ContextDeltaDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> domains = null;
        
        public ContextDeltaDetected(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> domains) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getDomains() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextDeltaDetected copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> domains) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextEventCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ContextEventCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextEventCompleted INSTANCE = null;
        
        private ContextEventCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextEventCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ContextEventCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextEventCreated INSTANCE = null;
        
        private ContextEventCreated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextEventFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ContextEventFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public ContextEventFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextEventFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextRepaired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "action", "", "<init>", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ContextRepaired extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String action = null;
        
        public ContextRepaired(@org.jetbrains.annotations.NotNull()
        java.lang.String action) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAction() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextRepaired copy(@org.jetbrains.annotations.NotNull()
        java.lang.String action) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextSyncCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ContextSyncCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextSyncCompleted INSTANCE = null;
        
        private ContextSyncCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextSyncFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ContextSyncFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public ContextSyncFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextSyncFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextSyncStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ContextSyncStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextSyncStarted INSTANCE = null;
        
        private ContextSyncStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ContextUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextUpdated INSTANCE = null;
        
        private ContextUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ContextValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public ContextValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ContextValidationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ContextValidationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ContextValidationStarted INSTANCE = null;
        
        private ContextValidationStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieConflictDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "conflicts", "", "<init>", "(I)V", "getConflicts", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"})
    public static final class CookieConflictDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int conflicts = 0;
        
        public CookieConflictDetected(int conflicts) {
        }
        
        public final int getConflicts() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieConflictDetected copy(int conflicts) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieConflictResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CookieConflictResolved extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieConflictResolved INSTANCE = null;
        
        private CookieConflictResolved() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieConsistencyVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CookieConsistencyVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieConsistencyVerified INSTANCE = null;
        
        private CookieConsistencyVerified() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CookieCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        public CookieCreated(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieCreated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieDeleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CookieDeleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        public CookieDeleted(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieDeleted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CookieExpired extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        public CookieExpired(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieExpired copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CookieManagerReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieManagerReady INSTANCE = null;
        
        private CookieManagerReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookiePlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CookiePlatformReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookiePlatformReady INSTANCE = null;
        
        private CookiePlatformReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieStoreCleared;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CookieStoreCleared extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieStoreCleared INSTANCE = null;
        
        private CookieStoreCleared() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieSynchronizationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CookieSynchronizationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieSynchronizationCompleted INSTANCE = null;
        
        private CookieSynchronizationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieSynchronizationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CookieSynchronizationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public CookieSynchronizationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieSynchronizationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieSynchronizationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CookieSynchronizationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieSynchronizationStarted INSTANCE = null;
        
        private CookieSynchronizationStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CookieUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        public CookieUpdated(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieUpdated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "name", "", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CookieValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public CookieValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieValidationPassed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CookieValidationPassed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        public CookieValidationPassed(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieValidationPassed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookieValidationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CookieValidationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        public CookieValidationStarted(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookieValidationStarted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CookiesUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CookiesUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CookiesUpdated INSTANCE = null;
        
        private CookiesUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CpuWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CpuWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CpuWarning INSTANCE = null;
        
        private CpuWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CriticalFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CriticalFailure extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CriticalFailure INSTANCE = null;
        
        private CriticalFailure() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CryptoManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class CryptoManagerReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CryptoManagerReady INSTANCE = null;
        
        private CryptoManagerReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CsrfTokenDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "tokenName", "", "<init>", "(Ljava/lang/String;)V", "getTokenName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class CsrfTokenDiscovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tokenName = null;
        
        public CsrfTokenDiscovered(@org.jetbrains.annotations.NotNull()
        java.lang.String tokenName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTokenName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CsrfTokenDiscovered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String tokenName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardAnimationReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardAnimationReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardAnimationReady INSTANCE = null;
        
        private DashboardAnimationReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardBlueprintCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardBlueprintCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardBlueprintCreated INSTANCE = null;
        
        private DashboardBlueprintCreated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardContextReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardContextReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardContextReady INSTANCE = null;
        
        private DashboardContextReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardCreated INSTANCE = null;
        
        private DashboardCreated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardDatasetCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardDatasetCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardDatasetCreated INSTANCE = null;
        
        private DashboardDatasetCreated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardDeltaReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardDeltaReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardDeltaReady INSTANCE = null;
        
        private DashboardDeltaReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardGenerationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardGenerationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardGenerationCompleted INSTANCE = null;
        
        private DashboardGenerationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardGenerationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class DashboardGenerationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public DashboardGenerationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardGenerationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardGenerationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardGenerationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardGenerationStarted INSTANCE = null;
        
        private DashboardGenerationStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardLaunchStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardLaunchStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardLaunchStarted INSTANCE = null;
        
        private DashboardLaunchStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardReady INSTANCE = null;
        
        private DashboardReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardReadyForLayout;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardReadyForLayout extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardReadyForLayout INSTANCE = null;
        
        private DashboardReadyForLayout() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardRefreshPlanned;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardRefreshPlanned extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardRefreshPlanned INSTANCE = null;
        
        private DashboardRefreshPlanned() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardRefreshRequired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "scope", "", "<init>", "(Ljava/lang/String;)V", "getScope", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class DashboardRefreshRequired extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String scope = null;
        
        public DashboardRefreshRequired(@org.jetbrains.annotations.NotNull()
        java.lang.String scope) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getScope() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardRefreshRequired copy(@org.jetbrains.annotations.NotNull()
        java.lang.String scope) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardRenderFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class DashboardRenderFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public DashboardRenderFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardRenderFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardRenderStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardRenderStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardRenderStarted INSTANCE = null;
        
        private DashboardRenderStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DashboardUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DashboardUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DashboardUpdated INSTANCE = null;
        
        private DashboardUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataDeleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class DataDeleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        
        public DataDeleted(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DataDeleted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u00d6\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataRetrieved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "key", "success", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getDomain", "()Ljava/lang/String;", "getKey", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app"})
    public static final class DataRetrieved extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        private final boolean success = false;
        
        public DataRetrieved(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key, boolean success) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        public final boolean getSuccess() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DataRetrieved copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key, boolean success) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataStored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class DataStored extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        
        public DataStored(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DataStored copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DependenciesResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DependenciesResolved extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DependenciesResolved INSTANCE = null;
        
        private DependenciesResolved() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DeviceUnlocked;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DeviceUnlocked extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DeviceUnlocked INSTANCE = null;
        
        private DeviceUnlocked() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DiagnosticReportGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DiagnosticReportGenerated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DiagnosticReportGenerated INSTANCE = null;
        
        private DiagnosticReportGenerated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DocumentParsed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DocumentParsed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DocumentParsed INSTANCE = null;
        
        private DocumentParsed() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DomAnalysisCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DomAnalysisCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DomAnalysisCompleted INSTANCE = null;
        
        private DomAnalysisCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DomAnalysisFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class DomAnalysisFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public DomAnalysisFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DomAnalysisFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DomAnalysisStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class DomAnalysisStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DomAnalysisStarted INSTANCE = null;
        
        private DomAnalysisStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DomainModelCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "modelName", "", "<init>", "(Ljava/lang/String;)V", "getModelName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class DomainModelCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String modelName = null;
        
        public DomainModelCreated(@org.jetbrains.annotations.NotNull()
        java.lang.String modelName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getModelName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DomainModelCreated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String modelName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointCacheUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class EndpointCacheUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointCacheUpdated INSTANCE = null;
        
        private EndpointCacheUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointDegraded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "identifier", "", "latencyMs", "", "<init>", "(Ljava/lang/String;J)V", "getIdentifier", "()Ljava/lang/String;", "getLatencyMs", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class EndpointDegraded extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String identifier = null;
        private final long latencyMs = 0L;
        
        public EndpointDegraded(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier, long latencyMs) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIdentifier() {
            return null;
        }
        
        public final long getLatencyMs() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointDegraded copy(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier, long latencyMs) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "method", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class EndpointDiscovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String method = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        public EndpointDiscovered(@org.jetbrains.annotations.NotNull()
        java.lang.String method, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMethod() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointDiscovered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String method, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointDiscoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class EndpointDiscoveryCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointDiscoveryCompleted INSTANCE = null;
        
        private EndpointDiscoveryCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointDiscoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class EndpointDiscoveryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointDiscoveryStarted INSTANCE = null;
        
        private EndpointDiscoveryStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "identifier", "", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class EndpointFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String identifier = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public EndpointFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIdentifier() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointHealthCheckStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class EndpointHealthCheckStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointHealthCheckStarted INSTANCE = null;
        
        private EndpointHealthCheckStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointHealthy;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "identifier", "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class EndpointHealthy extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String identifier = null;
        
        public EndpointHealthy(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIdentifier() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointHealthy copy(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "identifier", "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class EndpointRecovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String identifier = null;
        
        public EndpointRecovered(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIdentifier() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointRecovered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "identifier", "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class EndpointRegistered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String identifier = null;
        
        public EndpointRegistered(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIdentifier() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointRegistered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointRegistryReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class EndpointRegistryReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointRegistryReady INSTANCE = null;
        
        private EndpointRegistryReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointUnreachable;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "identifier", "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class EndpointUnreachable extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String identifier = null;
        
        public EndpointUnreachable(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIdentifier() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointUnreachable copy(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EndpointValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "identifier", "", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class EndpointValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String identifier = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public EndpointValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIdentifier() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EndpointValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EntityClassified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "id", "", "type", "confidence", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;F)V", "getId", "()Ljava/lang/String;", "getType", "getConfidence", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class EntityClassified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = null;
        private final float confidence = 0.0F;
        
        public EntityClassified(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String type, float confidence) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        public final float getConfidence() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final float component3() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EntityClassified copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String type, float confidence) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EntityLinked;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "sourceId", "", "targetId", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSourceId", "()Ljava/lang/String;", "getTargetId", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class EntityLinked extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sourceId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String targetId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = null;
        
        public EntityLinked(@org.jetbrains.annotations.NotNull()
        java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
        java.lang.String targetId, @org.jetbrains.annotations.NotNull()
        java.lang.String type) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSourceId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTargetId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EntityLinked copy(@org.jetbrains.annotations.NotNull()
        java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
        java.lang.String targetId, @org.jetbrains.annotations.NotNull()
        java.lang.String type) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$EntitySerialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "entityId", "", "<init>", "(Ljava/lang/String;)V", "getEntityId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class EntitySerialized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String entityId = null;
        
        public EntitySerialized(@org.jetbrains.annotations.NotNull()
        java.lang.String entityId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEntityId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.EntitySerialized copy(@org.jetbrains.annotations.NotNull()
        java.lang.String entityId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ExamScheduleUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ExamScheduleUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ExamScheduleUpdated INSTANCE = null;
        
        private ExamScheduleUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FailoverInitiated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "identifier", "", "newEndpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "getNewEndpoint", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class FailoverInitiated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String identifier = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String newEndpoint = null;
        
        public FailoverInitiated(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier, @org.jetbrains.annotations.NotNull()
        java.lang.String newEndpoint) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIdentifier() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNewEndpoint() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FailoverInitiated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String identifier, @org.jetbrains.annotations.NotNull()
        java.lang.String newEndpoint) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureDisabled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "featureId", "", "<init>", "(Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class FeatureDisabled extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        
        public FeatureDisabled(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FeatureDisabled copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureEnabled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "featureId", "", "<init>", "(Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class FeatureEnabled extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        
        public FeatureEnabled(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FeatureEnabled copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "featureId", "", "<init>", "(Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class FeatureRegistered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        
        public FeatureRegistered(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FeatureRegistered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureRegistryReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class FeatureRegistryReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FeatureRegistryReady INSTANCE = null;
        
        private FeatureRegistryReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "featureId", "", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class FeatureValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public FeatureValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FeatureValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeeBalanceChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "oldBalance", "", "newBalance", "<init>", "(DD)V", "getOldBalance", "()D", "getNewBalance", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"})
    public static final class FeeBalanceChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final double oldBalance = 0.0;
        private final double newBalance = 0.0;
        
        public FeeBalanceChanged(double oldBalance, double newBalance) {
        }
        
        public final double getOldBalance() {
            return 0.0;
        }
        
        public final double getNewBalance() {
            return 0.0;
        }
        
        public final double component1() {
            return 0.0;
        }
        
        public final double component2() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FeeBalanceChanged copy(double oldBalance, double newBalance) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FinancialContextChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class FinancialContextChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FinancialContextChanged INSTANCE = null;
        
        private FinancialContextChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FormsDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"})
    public static final class FormsDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int count = 0;
        
        public FormsDetected(int count) {
        }
        
        public final int getCount() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FormsDetected copy(int count) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$GraphUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class GraphUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.GraphUpdated INSTANCE = null;
        
        private GraphUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$GraphValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class GraphValidated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.GraphValidated INSTANCE = null;
        
        private GraphValidated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$HealthMonitorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class HealthMonitorReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.HealthMonitorReady INSTANCE = null;
        
        private HealthMonitorReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$HealthStatusChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class HealthStatusChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.HealthStatusChanged INSTANCE = null;
        
        private HealthStatusChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$HostelInformationChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class HostelInformationChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.HostelInformationChanged INSTANCE = null;
        
        private HostelInformationChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IncrementalRenderCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class IncrementalRenderCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.IncrementalRenderCompleted INSTANCE = null;
        
        private IncrementalRenderCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class IntegrityFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        
        public IntegrityFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.IntegrityFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "details", "", "<init>", "(Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class IntegrityFailure extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String details = null;
        
        public IntegrityFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String details) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDetails() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.IntegrityFailure copy(@org.jetbrains.annotations.NotNull()
        java.lang.String details) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class IntegrityVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        
        public IntegrityVerified(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.IntegrityVerified copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$JsonGenerationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class JsonGenerationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.JsonGenerationCompleted INSTANCE = null;
        
        private JsonGenerationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$JsonGenerationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class JsonGenerationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public JsonGenerationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.JsonGenerationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$JsonGenerationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class JsonGenerationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.JsonGenerationStarted INSTANCE = null;
        
        private JsonGenerationStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$JsonValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class JsonValidated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.JsonValidated INSTANCE = null;
        
        private JsonValidated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$JsonValidationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class JsonValidationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.JsonValidationCompleted INSTANCE = null;
        
        private JsonValidationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KeystoreOperationRetried;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "attempt", "", "<init>", "(I)V", "getAttempt", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"})
    public static final class KeystoreOperationRetried extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int attempt = 0;
        
        public KeystoreOperationRetried(int attempt) {
        }
        
        public final int getAttempt() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.KeystoreOperationRetried copy(int attempt) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KeystoreRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class KeystoreRecovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.KeystoreRecovered INSTANCE = null;
        
        private KeystoreRecovered() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KeystoreRecoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class KeystoreRecoveryFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public KeystoreRecoveryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.KeystoreRecoveryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeEdgeCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "sourceId", "", "targetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSourceId", "()Ljava/lang/String;", "getTargetId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class KnowledgeEdgeCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sourceId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String targetId = null;
        
        public KnowledgeEdgeCreated(@org.jetbrains.annotations.NotNull()
        java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
        java.lang.String targetId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSourceId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTargetId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.KnowledgeEdgeCreated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
        java.lang.String targetId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeGraphCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class KnowledgeGraphCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.KnowledgeGraphCompleted INSTANCE = null;
        
        private KnowledgeGraphCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeGraphFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class KnowledgeGraphFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public KnowledgeGraphFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.KnowledgeGraphFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeGraphStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class KnowledgeGraphStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.KnowledgeGraphStarted INSTANCE = null;
        
        private KnowledgeGraphStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeGraphUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class KnowledgeGraphUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.KnowledgeGraphUpdated INSTANCE = null;
        
        private KnowledgeGraphUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$KnowledgeNodeCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "entityId", "", "<init>", "(Ljava/lang/String;)V", "getEntityId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class KnowledgeNodeCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String entityId = null;
        
        public KnowledgeNodeCreated(@org.jetbrains.annotations.NotNull()
        java.lang.String entityId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEntityId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.KnowledgeNodeCreated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String entityId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayerThreeCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class LayerThreeCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LayerThreeCompleted INSTANCE = null;
        
        private LayerThreeCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayoutGenerationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class LayoutGenerationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LayoutGenerationCompleted INSTANCE = null;
        
        private LayoutGenerationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayoutGenerationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class LayoutGenerationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public LayoutGenerationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LayoutGenerationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayoutGenerationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class LayoutGenerationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LayoutGenerationStarted INSTANCE = null;
        
        private LayoutGenerationStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayoutOptimized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class LayoutOptimized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LayoutOptimized INSTANCE = null;
        
        private LayoutOptimized() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LayoutReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class LayoutReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LayoutReady INSTANCE = null;
        
        private LayoutReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LearningContextChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class LearningContextChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LearningContextChanged INSTANCE = null;
        
        private LearningContextChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LibraryDueSoon;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "bookTitle", "", "daysRemaining", "", "<init>", "(Ljava/lang/String;I)V", "getBookTitle", "()Ljava/lang/String;", "getDaysRemaining", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class LibraryDueSoon extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String bookTitle = null;
        private final int daysRemaining = 0;
        
        public LibraryDueSoon(@org.jetbrains.annotations.NotNull()
        java.lang.String bookTitle, int daysRemaining) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBookTitle() {
            return null;
        }
        
        public final int getDaysRemaining() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LibraryDueSoon copy(@org.jetbrains.annotations.NotNull()
        java.lang.String bookTitle, int daysRemaining) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LibraryOverdue;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "bookTitle", "", "<init>", "(Ljava/lang/String;)V", "getBookTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class LibraryOverdue extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String bookTitle = null;
        
        public LibraryOverdue(@org.jetbrains.annotations.NotNull()
        java.lang.String bookTitle) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBookTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LibraryOverdue copy(@org.jetbrains.annotations.NotNull()
        java.lang.String bookTitle) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginAuthenticated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "regNumber", "", "<init>", "(Ljava/lang/String;)V", "getRegNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class LoginAuthenticated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String regNumber = null;
        
        public LoginAuthenticated(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRegNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginAuthenticated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginCancelled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class LoginCancelled extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginCancelled INSTANCE = null;
        
        private LoginCancelled() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "regNumber", "", "<init>", "(Ljava/lang/String;)V", "getRegNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class LoginCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String regNumber = null;
        
        public LoginCompleted(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRegNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginCompleted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getErrorCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class LoginFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorCode = null;
        
        public LoginFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, @org.jetbrains.annotations.Nullable()
        java.lang.String errorCode) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, @org.jetbrains.annotations.Nullable()
        java.lang.String errorCode) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginPortalConnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "portalUrl", "", "<init>", "(Ljava/lang/String;)V", "getPortalUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class LoginPortalConnected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String portalUrl = null;
        
        public LoginPortalConnected(@org.jetbrains.annotations.NotNull()
        java.lang.String portalUrl) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPortalUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginPortalConnected copy(@org.jetbrains.annotations.NotNull()
        java.lang.String portalUrl) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginSessionCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "regNumber", "", "portalType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRegNumber", "()Ljava/lang/String;", "getPortalType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class LoginSessionCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String regNumber = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String portalType = null;
        
        public LoginSessionCreated(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber, @org.jetbrains.annotations.NotNull()
        java.lang.String portalType) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRegNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPortalType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginSessionCreated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber, @org.jetbrains.annotations.NotNull()
        java.lang.String portalType) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginWorkflowProcessing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "step", "", "<init>", "(Ljava/lang/String;)V", "getStep", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class LoginWorkflowProcessing extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String step = null;
        
        public LoginWorkflowProcessing(@org.jetbrains.annotations.NotNull()
        java.lang.String step) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStep() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginWorkflowProcessing copy(@org.jetbrains.annotations.NotNull()
        java.lang.String step) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginWorkflowStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class LoginWorkflowStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginWorkflowStarted INSTANCE = null;
        
        private LoginWorkflowStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LogoutCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class LogoutCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LogoutCompleted INSTANCE = null;
        
        private LogoutCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MemoryPressureDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class MemoryPressureDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.MemoryPressureDetected INSTANCE = null;
        
        private MemoryPressureDetected() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MemoryWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class MemoryWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.MemoryWarning INSTANCE = null;
        
        private MemoryWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MenuDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "label", "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class MenuDiscovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String label = null;
        
        public MenuDiscovered(@org.jetbrains.annotations.NotNull()
        java.lang.String label) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.MenuDiscovered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String label) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MotionEngineCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class MotionEngineCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.MotionEngineCompleted INSTANCE = null;
        
        private MotionEngineCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MotionEngineFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class MotionEngineFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public MotionEngineFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.MotionEngineFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MotionEngineStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class MotionEngineStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.MotionEngineStarted INSTANCE = null;
        
        private MotionEngineStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NavigationDiscoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NavigationDiscoveryCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NavigationDiscoveryCompleted INSTANCE = null;
        
        private NavigationDiscoveryCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NavigationDiscoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class NavigationDiscoveryFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public NavigationDiscoveryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NavigationDiscoveryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NavigationDiscoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NavigationDiscoveryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NavigationDiscoveryStarted INSTANCE = null;
        
        private NavigationDiscoveryStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NavigationGraphUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NavigationGraphUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NavigationGraphUpdated INSTANCE = null;
        
        private NavigationGraphUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NavigationNodeDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "label", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class NavigationNodeDiscovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String label = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        public NavigationNodeDiscovered(@org.jetbrains.annotations.NotNull()
        java.lang.String label, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NavigationNodeDiscovered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String label, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkConnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkConnected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkConnected INSTANCE = null;
        
        private NetworkConnected() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkConnecting;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkConnecting extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkConnecting INSTANCE = null;
        
        private NetworkConnecting() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkDisconnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkDisconnected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkDisconnected INSTANCE = null;
        
        private NetworkDisconnected() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class NetworkFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public NetworkFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkInitializing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkInitializing extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkInitializing INSTANCE = null;
        
        private NetworkInitializing() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkOffline;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkOffline extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkOffline INSTANCE = null;
        
        private NetworkOffline() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkOnline;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkOnline extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkOnline INSTANCE = null;
        
        private NetworkOnline() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkPlatformReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkPlatformReady INSTANCE = null;
        
        private NetworkPlatformReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkReady INSTANCE = null;
        
        private NetworkReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkRecovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkRecovered INSTANCE = null;
        
        private NetworkRecovered() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkRecoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkRecoveryCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkRecoveryCompleted INSTANCE = null;
        
        private NetworkRecoveryCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkRecoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkRecoveryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkRecoveryStarted INSTANCE = null;
        
        private NetworkRecoveryStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NetworkWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkWarning INSTANCE = null;
        
        private NetworkWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NewAnnouncement;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class NewAnnouncement extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        
        public NewAnnouncement(@org.jetbrains.annotations.NotNull()
        java.lang.String title) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NewAnnouncement copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NewDocumentAvailable;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "docType", "", "<init>", "(Ljava/lang/String;)V", "getDocType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class NewDocumentAvailable extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String docType = null;
        
        public NewDocumentAvailable(@org.jetbrains.annotations.NotNull()
        java.lang.String docType) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDocType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NewDocumentAvailable copy(@org.jetbrains.annotations.NotNull()
        java.lang.String docType) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NewResultsAvailable;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NewResultsAvailable extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NewResultsAvailable INSTANCE = null;
        
        private NewResultsAvailable() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NewTimetableAvailable;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NewTimetableAvailable extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NewTimetableAvailable INSTANCE = null;
        
        private NewTimetableAvailable() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NormalizedJsonCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class NormalizedJsonCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NormalizedJsonCreated INSTANCE = null;
        
        private NormalizedJsonCreated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NotificationGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "notificationId", "", "<init>", "(Ljava/lang/String;)V", "getNotificationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class NotificationGenerated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String notificationId = null;
        
        public NotificationGenerated(@org.jetbrains.annotations.NotNull()
        java.lang.String notificationId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNotificationId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NotificationGenerated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String notificationId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$OfflineContextLoaded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class OfflineContextLoaded extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.OfflineContextLoaded INSTANCE = null;
        
        private OfflineContextLoaded() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PaymentRecorded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "amount", "", "<init>", "(D)V", "getAmount", "()D", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"})
    public static final class PaymentRecorded extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final double amount = 0.0;
        
        public PaymentRecorded(double amount) {
        }
        
        public final double getAmount() {
            return 0.0;
        }
        
        public final double component1() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PaymentRecorded copy(double amount) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PipelineExecutionFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class PipelineExecutionFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public PipelineExecutionFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PipelineExecutionFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PipelineValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class PipelineValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public PipelineValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PipelineValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformIntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PlatformIntegrityVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PlatformIntegrityVerified INSTANCE = null;
        
        private PlatformIntegrityVerified() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformValidationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PlatformValidationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PlatformValidationCompleted INSTANCE = null;
        
        private PlatformValidationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "step", "", "reason", "", "<init>", "(ILjava/lang/String;)V", "getStep", "()I", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class PlatformValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int step = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public PlatformValidationFailed(int step, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        public final int getStep() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PlatformValidationFailed copy(int step, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformValidationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PlatformValidationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PlatformValidationStarted INSTANCE = null;
        
        private PlatformValidationStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformValidationStepCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "step", "", "name", "", "<init>", "(ILjava/lang/String;)V", "getStep", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class PlatformValidationStepCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int step = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        public PlatformValidationStepCompleted(int step, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
        }
        
        public final int getStep() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PlatformValidationStepCompleted copy(int step, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalAdaptationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalAdaptationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalAdaptationCompleted INSTANCE = null;
        
        private PortalAdaptationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalAuthenticated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalAuthenticated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalAuthenticated INSTANCE = null;
        
        private PortalAuthenticated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConflictDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalConflictDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalConflictDetected INSTANCE = null;
        
        private PortalConflictDetected() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConflictResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalConflictResolved extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalConflictResolved INSTANCE = null;
        
        private PortalConflictResolved() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalConnected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalConnected INSTANCE = null;
        
        private PortalConnected() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConnecting;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalConnecting extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalConnecting INSTANCE = null;
        
        private PortalConnecting() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConnectionFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class PortalConnectionFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public PortalConnectionFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalConnectionFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalConsistencyVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalConsistencyVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalConsistencyVerified INSTANCE = null;
        
        private PortalConsistencyVerified() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalDisconnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalDisconnected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalDisconnected INSTANCE = null;
        
        private PortalDisconnected() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalDiscoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalDiscoveryCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalDiscoveryCompleted INSTANCE = null;
        
        private PortalDiscoveryCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalDiscoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class PortalDiscoveryFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public PortalDiscoveryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalDiscoveryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalDiscoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalDiscoveryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalDiscoveryStarted INSTANCE = null;
        
        private PortalDiscoveryStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalEndpointChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalEndpointChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalEndpointChanged INSTANCE = null;
        
        private PortalEndpointChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalInitializing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalInitializing extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalInitializing INSTANCE = null;
        
        private PortalInitializing() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalJsonReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalJsonReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalJsonReady INSTANCE = null;
        
        private PortalJsonReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMapUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalMapUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalMapUpdated INSTANCE = null;
        
        private PortalMapUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMapperReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalMapperReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalMapperReady INSTANCE = null;
        
        private PortalMapperReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMappingCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalMappingCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalMappingCompleted INSTANCE = null;
        
        private PortalMappingCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMappingFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class PortalMappingFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public PortalMappingFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalMappingFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMappingStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalMappingStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalMappingStarted INSTANCE = null;
        
        private PortalMappingStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalModuleDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class PortalModuleDiscovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        public PortalModuleDiscovered(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalModuleDiscovered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMonitorFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "error", "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class PortalMonitorFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        public PortalMonitorFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalMonitorFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalMonitorStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalMonitorStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalMonitorStarted INSTANCE = null;
        
        private PortalMonitorStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalNavigationChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalNavigationChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalNavigationChanged INSTANCE = null;
        
        private PortalNavigationChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalNavigationDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalNavigationDiscovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalNavigationDiscovered INSTANCE = null;
        
        private PortalNavigationDiscovered() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalPageDiscovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class PortalPageDiscovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        public PortalPageDiscovered(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalPageDiscovered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalPlatformReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalPlatformReady INSTANCE = null;
        
        private PortalPlatformReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalReady INSTANCE = null;
        
        private PortalReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalReconnecting;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalReconnecting extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalReconnecting INSTANCE = null;
        
        private PortalReconnecting() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalRediscoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalRediscoveryCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalRediscoveryCompleted INSTANCE = null;
        
        private PortalRediscoveryCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalRediscoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalRediscoveryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalRediscoveryStarted INSTANCE = null;
        
        private PortalRediscoveryStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalSchemaChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalSchemaChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalSchemaChanged INSTANCE = null;
        
        private PortalSchemaChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalStateUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalStateUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalStateUpdated INSTANCE = null;
        
        private PortalStateUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalStructureChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalStructureChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalStructureChanged INSTANCE = null;
        
        private PortalStructureChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalSyncCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalSyncCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalSyncCompleted INSTANCE = null;
        
        private PortalSyncCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalSyncFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class PortalSyncFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public PortalSyncFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalSyncFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalSyncStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PortalSyncStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalSyncStarted INSTANCE = null;
        
        private PortalSyncStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PortalVersionChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "oldVersion", "", "newVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOldVersion", "()Ljava/lang/String;", "getNewVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class PortalVersionChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String oldVersion = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String newVersion = null;
        
        public PortalVersionChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String oldVersion, @org.jetbrains.annotations.NotNull()
        java.lang.String newVersion) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOldVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNewVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PortalVersionChanged copy(@org.jetbrains.annotations.NotNull()
        java.lang.String oldVersion, @org.jetbrains.annotations.NotNull()
        java.lang.String newVersion) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PriorityChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class PriorityChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PriorityChanged INSTANCE = null;
        
        private PriorityChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PriorityEventDispatched;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "eventName", "", "priority", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "getPriority", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class PriorityEventDispatched extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String eventName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String priority = null;
        
        public PriorityEventDispatched(@org.jetbrains.annotations.NotNull()
        java.lang.String eventName, @org.jetbrains.annotations.NotNull()
        java.lang.String priority) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEventName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPriority() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PriorityEventDispatched copy(@org.jetbrains.annotations.NotNull()
        java.lang.String eventName, @org.jetbrains.annotations.NotNull()
        java.lang.String priority) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ProcessRecreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ProcessRecreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ProcessRecreated INSTANCE = null;
        
        private ProcessRecreated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ReasoningCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ReasoningCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ReasoningCompleted INSTANCE = null;
        
        private ReasoningCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecommendationsGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RecommendationsGenerated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RecommendationsGenerated INSTANCE = null;
        
        private RecommendationsGenerated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u00d6\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "strategy", "Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "durationMs", "", "<init>", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/RecoveryStrategy;J)V", "getServiceName", "()Ljava/lang/String;", "getStrategy", "()Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "getDurationMs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class RecoveryCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.RecoveryStrategy strategy = null;
        private final long durationMs = 0L;
        
        public RecoveryCompleted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, long durationMs) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy getStrategy() {
            return null;
        }
        
        public final long getDurationMs() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RecoveryCompleted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, long durationMs) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0083\u0004J\n\u0010\u001b\u001a\u00020\bH\u00d6\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "strategy", "Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "error", "attempts", "", "<init>", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/RecoveryStrategy;Ljava/lang/String;I)V", "getServiceName", "()Ljava/lang/String;", "getStrategy", "()Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "getError", "getAttempts", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class RecoveryFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.RecoveryStrategy strategy = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        private final int attempts = 0;
        
        public RecoveryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy getStrategy() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        public final int getAttempts() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RecoveryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RecoveryManagerReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RecoveryManagerReady INSTANCE = null;
        
        private RecoveryManagerReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RecoveryRequested extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RecoveryRequested INSTANCE = null;
        
        private RecoveryRequested() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0007H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "strategy", "Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "attempt", "", "<init>", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/RecoveryStrategy;I)V", "getServiceName", "()Ljava/lang/String;", "getStrategy", "()Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "getAttempt", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class RecoveryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.RecoveryStrategy strategy = null;
        private final int attempt = 0;
        
        public RecoveryStarted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, int attempt) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy getStrategy() {
            return null;
        }
        
        public final int getAttempt() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RecoveryStarted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, int attempt) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RegistrationClosed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RegistrationClosed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RegistrationClosed INSTANCE = null;
        
        private RegistrationClosed() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RegistrationOpened;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RegistrationOpened extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RegistrationOpened INSTANCE = null;
        
        private RegistrationOpened() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RegistryReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RegistryReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RegistryReady INSTANCE = null;
        
        private RegistryReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ReinitializeServiceRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "<init>", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ReinitializeServiceRequested extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ReinitializeServiceRequested(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ReinitializeServiceRequested copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RelationshipCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "relationshipId", "", "confidence", "", "<init>", "(Ljava/lang/String;F)V", "getRelationshipId", "()Ljava/lang/String;", "getConfidence", "()F", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class RelationshipCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String relationshipId = null;
        private final float confidence = 0.0F;
        
        public RelationshipCreated(@org.jetbrains.annotations.NotNull()
        java.lang.String relationshipId, float confidence) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRelationshipId() {
            return null;
        }
        
        public final float getConfidence() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RelationshipCreated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String relationshipId, float confidence) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RelationshipEngineCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RelationshipEngineCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RelationshipEngineCompleted INSTANCE = null;
        
        private RelationshipEngineCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RelationshipEngineFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class RelationshipEngineFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public RelationshipEngineFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RelationshipEngineFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RelationshipEngineStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RelationshipEngineStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RelationshipEngineStarted INSTANCE = null;
        
        private RelationshipEngineStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RenderTreeGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RenderTreeGenerated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RenderTreeGenerated INSTANCE = null;
        
        private RenderTreeGenerated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestCaptured;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "requestId", "", "<init>", "(Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class RequestCaptured extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String requestId = null;
        
        public RequestCaptured(@org.jetbrains.annotations.NotNull()
        java.lang.String requestId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRequestId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RequestCaptured copy(@org.jetbrains.annotations.NotNull()
        java.lang.String requestId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestDiscoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RequestDiscoveryCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RequestDiscoveryCompleted INSTANCE = null;
        
        private RequestDiscoveryCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestDiscoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RequestDiscoveryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RequestDiscoveryStarted INSTANCE = null;
        
        private RequestDiscoveryStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestEnriched;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RequestEnriched extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RequestEnriched INSTANCE = null;
        
        private RequestEnriched() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestPipelineReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RequestPipelineReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RequestPipelineReady INSTANCE = null;
        
        private RequestPipelineReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RequestReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RequestReady INSTANCE = null;
        
        private RequestReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestReceived;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RequestReceived extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RequestReceived INSTANCE = null;
        
        private RequestReceived() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestRegistryUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RequestRegistryUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RequestRegistryUpdated INSTANCE = null;
        
        private RequestRegistryUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestSigned;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RequestSigned extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RequestSigned INSTANCE = null;
        
        private RequestSigned() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RequestValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RequestValidated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RequestValidated INSTANCE = null;
        
        private RequestValidated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResourceWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ResourceWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        public ResourceWarning(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ResourceWarning copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResponseFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ResponseFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public ResponseFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ResponseFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResponseProcessed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ResponseProcessed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ResponseProcessed INSTANCE = null;
        
        private ResponseProcessed() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResponseReceived;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ResponseReceived extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ResponseReceived INSTANCE = null;
        
        private ResponseReceived() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResponseValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ResponseValidated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ResponseValidated INSTANCE = null;
        
        private ResponseValidated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResponsiveGridCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "columns", "", "<init>", "(I)V", "getColumns", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"})
    public static final class ResponsiveGridCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int columns = 0;
        
        public ResponsiveGridCreated(int columns) {
        }
        
        public final int getColumns() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ResponsiveGridCreated copy(int columns) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0006H\u00d6\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RetryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "error", "attempts", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getServiceName", "()Ljava/lang/String;", "getError", "getAttempts", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class RetryFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        private final int attempts = 0;
        
        public RetryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        public final int getAttempts() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RetryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RetryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "attempt", "", "maxAttempts", "<init>", "(Ljava/lang/String;II)V", "getServiceName", "()Ljava/lang/String;", "getAttempt", "()I", "getMaxAttempts", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class RetryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        private final int attempt = 0;
        private final int maxAttempts = 0;
        
        public RetryStarted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, int attempt, int maxAttempts) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        public final int getAttempt() {
            return 0;
        }
        
        public final int getMaxAttempts() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RetryStarted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, int attempt, int maxAttempts) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RollbackCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RollbackCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RollbackCompleted INSTANCE = null;
        
        private RollbackCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RollbackRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "<init>", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class RollbackRequested extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public RollbackRequested(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RollbackRequested copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "error", "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class RuntimeFailure extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        public RuntimeFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RuntimeFailure copy(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RuntimeInitialized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RuntimeInitialized INSTANCE = null;
        
        private RuntimeInitialized() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RuntimeReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RuntimeReady INSTANCE = null;
        
        private RuntimeReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeShutdown;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RuntimeShutdown extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RuntimeShutdown INSTANCE = null;
        
        private RuntimeShutdown() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class RuntimeWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RuntimeWarning INSTANCE = null;
        
        private RuntimeWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SchemaGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "<init>", "(Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class SchemaGenerated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        
        public SchemaGenerated(@org.jetbrains.annotations.NotNull()
        java.lang.String domain) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SchemaGenerated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SchemaValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class SchemaValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public SchemaValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SchemaValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecureConnectionEstablished;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "tlsVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getTlsVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class SecureConnectionEstablished extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tlsVersion = null;
        
        public SecureConnectionEstablished(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String tlsVersion) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTlsVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecureConnectionEstablished copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String tlsVersion) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecureStorageReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SecureStorageReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecureStorageReady INSTANCE = null;
        
        private SecureStorageReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityIncidentCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "incidentId", "", "level", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIncidentId", "()Ljava/lang/String;", "getLevel", "getDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class SecurityIncidentCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String incidentId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String level = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        
        public SecurityIncidentCreated(@org.jetbrains.annotations.NotNull()
        java.lang.String incidentId, @org.jetbrains.annotations.NotNull()
        java.lang.String level, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIncidentId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityIncidentCreated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String incidentId, @org.jetbrains.annotations.NotNull()
        java.lang.String level, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityMonitorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SecurityMonitorReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityMonitorReady INSTANCE = null;
        
        private SecurityMonitorReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SecurityPlatformReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityPlatformReady INSTANCE = null;
        
        private SecurityPlatformReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityReportGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "healthScore", "", "threatCount", "", "<init>", "(FI)V", "getHealthScore", "()F", "getThreatCount", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"})
    public static final class SecurityReportGenerated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final float healthScore = 0.0F;
        private final int threatCount = 0;
        
        public SecurityReportGenerated(float healthScore, int threatCount) {
        }
        
        public final float getHealthScore() {
            return 0.0F;
        }
        
        public final int getThreatCount() {
            return 0;
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityReportGenerated copy(float healthScore, int threatCount) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityScanCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SecurityScanCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityScanCompleted INSTANCE = null;
        
        private SecurityScanCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityValidationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SecurityValidationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityValidationCompleted INSTANCE = null;
        
        private SecurityValidationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "message", "", "level", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getLevel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class SecurityWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String level = null;
        
        public SecurityWarning(@org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.String level) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityWarning copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.String level) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SemanticClassificationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SemanticClassificationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SemanticClassificationStarted INSTANCE = null;
        
        private SemanticClassificationStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SemanticDomCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SemanticDomCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SemanticDomCreated INSTANCE = null;
        
        private SemanticDomCreated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SemanticRegistryUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SemanticRegistryUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SemanticRegistryUpdated INSTANCE = null;
        
        private SemanticRegistryUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "<init>", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ServiceRegistered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ServiceRegistered(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ServiceRegistered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRegistrationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "getError", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ServiceRegistrationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        public ServiceRegistrationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ServiceRegistrationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        java.lang.String error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "<init>", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ServiceResolved extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ServiceResolved(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ServiceResolved copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRestartRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "<init>", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ServiceRestartRequested extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ServiceRestartRequested(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ServiceRestartRequested copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRestarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "<init>", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ServiceRestarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ServiceRestarted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ServiceRestarted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionBackupLoaded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionBackupLoaded extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionBackupLoaded INSTANCE = null;
        
        private SessionBackupLoaded() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "portalType", "", "<init>", "(Ljava/lang/String;)V", "getPortalType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class SessionCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String portalType = null;
        
        public SessionCreated(@org.jetbrains.annotations.NotNull()
        java.lang.String portalType) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPortalType() {
            return null;
        }
        
        public SessionCreated() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionCreated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String portalType) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionCreating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionCreating extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionCreating INSTANCE = null;
        
        private SessionCreating() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionExpired extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionExpired INSTANCE = null;
        
        private SessionExpired() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpiredDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionExpiredDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionExpiredDetected INSTANCE = null;
        
        private SessionExpiredDetected() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpiring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionExpiring extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionExpiring INSTANCE = null;
        
        private SessionExpiring() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class SessionFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public SessionFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionIntegrityFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class SessionIntegrityFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public SessionIntegrityFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionIntegrityFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionIntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionIntegrityVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionIntegrityVerified INSTANCE = null;
        
        private SessionIntegrityVerified() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionPlatformReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionPlatformReady INSTANCE = null;
        
        private SessionPlatformReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionReauthenticated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionReauthenticated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionReauthenticated INSTANCE = null;
        
        private SessionReauthenticated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRecovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecovered INSTANCE = null;
        
        private SessionRecovered() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryAborted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRecoveryAborted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecoveryAborted INSTANCE = null;
        
        private SessionRecoveryAborted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRecoveryCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecoveryCompleted INSTANCE = null;
        
        private SessionRecoveryCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "attempts", "", "<init>", "(Ljava/lang/String;I)V", "getReason", "()Ljava/lang/String;", "getAttempts", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class SessionRecoveryFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final int attempts = 0;
        
        public SessionRecoveryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, int attempts) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final int getAttempts() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecoveryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, int attempts) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryRequired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRecoveryRequired extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecoveryRequired INSTANCE = null;
        
        private SessionRecoveryRequired() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRecoveryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecoveryStarted INSTANCE = null;
        
        private SessionRecoveryStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRecreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecreated INSTANCE = null;
        
        private SessionRecreated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRefreshed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRefreshed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRefreshed INSTANCE = null;
        
        private SessionRefreshed() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRefreshing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRefreshing extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRefreshing INSTANCE = null;
        
        private SessionRefreshing() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestorationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRestorationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRestorationStarted INSTANCE = null;
        
        private SessionRestorationStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRestored extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRestored INSTANCE = null;
        
        private SessionRestored() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestoredFromBackup;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRestoredFromBackup extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRestoredFromBackup INSTANCE = null;
        
        private SessionRestoredFromBackup() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestoring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionRestoring extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRestoring INSTANCE = null;
        
        private SessionRestoring() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionTerminated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionTerminated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionTerminated INSTANCE = null;
        
        private SessionTerminated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionTerminating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionTerminating extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionTerminating INSTANCE = null;
        
        private SessionTerminating() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionUpdated INSTANCE = null;
        
        private SessionUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionValidating extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidating INSTANCE = null;
        
        private SessionValidating() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class SessionValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public SessionValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationPassed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionValidationPassed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidationPassed INSTANCE = null;
        
        private SessionValidationPassed() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionValidationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidationStarted INSTANCE = null;
        
        private SessionValidationStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "warnings", "", "Lke/ac/mku/authcore/contracts/session/SessionWarning;", "<init>", "(Ljava/util/List;)V", "getWarnings", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"})
    public static final class SessionValidationWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings = null;
        
        public SessionValidationWarning(@org.jetbrains.annotations.NotNull()
        java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> getWarnings() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidationWarning copy(@org.jetbrains.annotations.NotNull()
        java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidatorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SessionValidatorReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidatorReady INSTANCE = null;
        
        private SessionValidatorReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SnapshotCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "snapshotId", "", "<init>", "(Ljava/lang/String;)V", "getSnapshotId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class SnapshotCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String snapshotId = null;
        
        public SnapshotCreated(@org.jetbrains.annotations.NotNull()
        java.lang.String snapshotId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSnapshotId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SnapshotCreated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String snapshotId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "previous", "Lke/ac/mku/authcore/state/RuntimeState;", "current", "<init>", "(Lke/ac/mku/authcore/state/RuntimeState;Lke/ac/mku/authcore/state/RuntimeState;)V", "getPrevious", "()Lke/ac/mku/authcore/state/RuntimeState;", "getCurrent", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"})
    public static final class StateChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.RuntimeState previous = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.RuntimeState current = null;
        
        public StateChanged(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.RuntimeState previous, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.RuntimeState current) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.RuntimeState getPrevious() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.RuntimeState getCurrent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.RuntimeState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.RuntimeState component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StateChanged copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.RuntimeState previous, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.RuntimeState current) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class StateInitialized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StateInitialized INSTANCE = null;
        
        private StateInitialized() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateReset;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class StateReset extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StateReset INSTANCE = null;
        
        private StateReset() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class StateRestored extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StateRestored INSTANCE = null;
        
        private StateRestored() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class StateValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public StateValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StateValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageCleared;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "count", "", "<init>", "(Ljava/lang/String;I)V", "getDomain", "()Ljava/lang/String;", "getCount", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class StorageCleared extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        private final int count = 0;
        
        public StorageCleared(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, int count) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        public final int getCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StorageCleared copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, int count) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getError", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class StorageFailure extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        public StorageFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StorageFailure copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "<init>", "(Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class StorageInitialized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        
        public StorageInitialized(@org.jetbrains.annotations.NotNull()
        java.lang.String domain) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StorageInitialized copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class StudentContextChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StudentContextChanged INSTANCE = null;
        
        private StudentContextChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class StudentContextFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public StudentContextFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StudentContextFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class StudentContextReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StudentContextReady INSTANCE = null;
        
        private StudentContextReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextSeedReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class StudentContextSeedReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StudentContextSeedReady INSTANCE = null;
        
        private StudentContextSeedReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class StudentContextStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StudentContextStarted INSTANCE = null;
        
        private StudentContextStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StudentContextUpdated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class StudentContextUpdated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StudentContextUpdated INSTANCE = null;
        
        private StudentContextUpdated() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SystemRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class SystemRecovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SystemRecovered INSTANCE = null;
        
        private SystemRecovered() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TablesDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"})
    public static final class TablesDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int count = 0;
        
        public TablesDetected(int count) {
        }
        
        public final int getCount() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.TablesDetected copy(int count) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ThreatDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "category", "", "level", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getLevel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ThreatDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String category = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String level = null;
        
        public ThreatDetected(@org.jetbrains.annotations.NotNull()
        java.lang.String category, @org.jetbrains.annotations.NotNull()
        java.lang.String level) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCategory() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ThreatDetected copy(@org.jetbrains.annotations.NotNull()
        java.lang.String category, @org.jetbrains.annotations.NotNull()
        java.lang.String level) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ThreatDetectorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ThreatDetectorReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ThreatDetectorReady INSTANCE = null;
        
        private ThreatDetectorReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TlsHandshakeCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "success", "", "durationMs", "", "<init>", "(Ljava/lang/String;ZJ)V", "getHost", "()Ljava/lang/String;", "getSuccess", "()Z", "getDurationMs", "()J", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app"})
    public static final class TlsHandshakeCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        private final boolean success = false;
        private final long durationMs = 0L;
        
        public TlsHandshakeCompleted(@org.jetbrains.annotations.NotNull()
        java.lang.String host, boolean success, long durationMs) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        public final boolean getSuccess() {
            return false;
        }
        
        public final long getDurationMs() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.TlsHandshakeCompleted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, boolean success, long durationMs) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TransitionCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class TransitionCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.TransitionCompleted INSTANCE = null;
        
        private TransitionCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TrustManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class TrustManagerReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.TrustManagerReady INSTANCE = null;
        
        private TrustManagerReady() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TrustViolationDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "violation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getViolation", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class TrustViolationDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String violation = null;
        
        public TrustViolationDetected(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String violation) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getViolation() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.TrustViolationDetected copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String violation) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$UnknownEntityDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "details", "", "<init>", "(Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class UnknownEntityDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String details = null;
        
        public UnknownEntityDetected(@org.jetbrains.annotations.NotNull()
        java.lang.String details) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDetails() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.UnknownEntityDetected copy(@org.jetbrains.annotations.NotNull()
        java.lang.String details) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ValidationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class ValidationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ValidationCompleted INSTANCE = null;
        
        private ValidationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ValidationWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class ValidationWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public ValidationWarning(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ValidationWarning copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetAnimationFinished;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "widgetId", "", "<init>", "(Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class WidgetAnimationFinished extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String widgetId = null;
        
        public WidgetAnimationFinished(@org.jetbrains.annotations.NotNull()
        java.lang.String widgetId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWidgetId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.WidgetAnimationFinished copy(@org.jetbrains.annotations.NotNull()
        java.lang.String widgetId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetOrderFinalized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class WidgetOrderFinalized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.WidgetOrderFinalized INSTANCE = null;
        
        private WidgetOrderFinalized() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetPriorityChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "widgetId", "", "newPriority", "", "<init>", "(Ljava/lang/String;I)V", "getWidgetId", "()Ljava/lang/String;", "getNewPriority", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class WidgetPriorityChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String widgetId = null;
        private final int newPriority = 0;
        
        public WidgetPriorityChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String widgetId, int newPriority) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWidgetId() {
            return null;
        }
        
        public final int getNewPriority() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.WidgetPriorityChanged copy(@org.jetbrains.annotations.NotNull()
        java.lang.String widgetId, int newPriority) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "widgetId", "", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getCategory", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class WidgetRegistered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String widgetId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String category = null;
        
        public WidgetRegistered(@org.jetbrains.annotations.NotNull()
        java.lang.String widgetId, @org.jetbrains.annotations.NotNull()
        java.lang.String category) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWidgetId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCategory() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.WidgetRegistered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String widgetId, @org.jetbrains.annotations.NotNull()
        java.lang.String category) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRegistryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class WidgetRegistryCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.WidgetRegistryCompleted INSTANCE = null;
        
        private WidgetRegistryCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRegistryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class WidgetRegistryFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public WidgetRegistryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.WidgetRegistryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRegistryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "<init>", "()V", "app"})
    public static final class WidgetRegistryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.WidgetRegistryStarted INSTANCE = null;
        
        private WidgetRegistryStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRemoved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "widgetId", "", "<init>", "(Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class WidgetRemoved extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String widgetId = null;
        
        public WidgetRemoved(@org.jetbrains.annotations.NotNull()
        java.lang.String widgetId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWidgetId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.WidgetRemoved copy(@org.jetbrains.annotations.NotNull()
        java.lang.String widgetId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$WidgetRendered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "widgetId", "", "<init>", "(Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"})
    public static final class WidgetRendered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String widgetId = null;
        
        public WidgetRendered(@org.jetbrains.annotations.NotNull()
        java.lang.String widgetId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWidgetId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.WidgetRendered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String widgetId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}