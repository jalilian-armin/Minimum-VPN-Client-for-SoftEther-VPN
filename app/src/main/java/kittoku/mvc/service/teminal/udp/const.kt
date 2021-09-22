package kittoku.mvc.service.teminal.udp

import kittoku.mvc.service.teminal.ip.IP_MTU
import kittoku.mvc.unit.ethernet.ETHERNET_HEADER_SIZE


internal const val UDP_CIPHER_ALGORITHM = "ChaCha20-Poly1305"
internal const val CHACHA20_POLY1305_KEY_SIZE = 32
internal const val CHACHA20_POLY1305_NONCE_SIZE = 12

internal const val UDP_BUFFER_SIZE = 1600
internal const val UDP_SOFTETHER_HEADER_SIZE = 23 // 23 = Cookie + 2 * tick + Size + Flag
internal const val UDP_MAX_PADDING_SIZE = 32
internal const val UDP_MAX_PAYLOAD_SIZE = ETHERNET_HEADER_SIZE + IP_MTU

internal const val UDP_KEEP_ALIVE_TIMEOUT = 2_100
internal const val UDP_KEEP_ALIVE_MIN_INTERVAL = 500
internal const val UDP_KEEP_ALIVE_INTERVAL_DIFF = 500

internal const val UDP_PACKET_AVAILABLE_TIME = 30_000

internal const val UDP_NATT_PORT = 5004
internal const val UDP_NATT_INTERVAL_INITIAL = 3_000
internal const val UDP_NATT_INTERVAL_MIN = 300_000
internal const val UDP_NATT_INTERVAL_DIFF = 300_000

internal const val UDP_NATT_IP_REGEX = """^IP=[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+"""
internal const val UDP_NATT_PORT_REGEX = """PORT=[0-9]+$"""
